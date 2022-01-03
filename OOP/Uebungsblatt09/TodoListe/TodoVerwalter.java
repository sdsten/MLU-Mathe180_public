import java.io.*;
public class TodoVerwalter {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        TodoListe liste = new TodoListe();
        
        do {
            //leer -> erzeuge leere liste
            //aufg -> neue aufgabe
            //erl  -> markiere index als erledigt
            //anz0 -> gibt anzahl aller aufgaben zurücl
            //anz1 -> gibt anzahl der erledigten zurück
            
            //ausg -> alles ausgeben
            //entf -> entferne einen Eintrag
            switch(in.readLine()) {
                case "leer":
                    
                    liste = TodoListe.erzeugeLeereListe(Integer.parseInt(in.readLine()));
                    System.out.println(liste.aufgaben.length);
                    break;
                case "aufg":
                    // lese Beschreibung
                    System.out.println(TodoListe.aufgabeHinzufuegen(liste, in.readLine()));
                    break;
                case "erl":
                    int index = Integer.parseInt(in.readLine());
                    TodoListe.markiereAlsErledigt(liste, index);
                    System.out.println(liste.aufgaben[index].erledigt);
                    break;
                case "anz0":
                    System.out.println(TodoListe.gibAnzahl(liste, false));
                    break;
                case "anz1":
                    System.out.println(TodoListe.gibAnzahl(liste, true));
                    break;
                case "entf":
                    TodoListe.entferne(liste, Integer.parseInt(in.readLine()));
                    break;
                case "ausg":
                    TodoListe.ausgabe(liste, Integer.parseInt(in.readLine()));
                    break;
                default:
                    return;
            }
        } while(true);
    }   
}