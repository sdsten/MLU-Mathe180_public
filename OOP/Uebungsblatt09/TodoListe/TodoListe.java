public class TodoListe {
    
    Aufgabe[] aufgaben = null;
    int indexEmpty = 0;


    // CREATES A NEW EMPTY TODOLISTE
    public static TodoListe erzeugeLeereListe (int maxAnzahl) {
        TodoListe liste = new TodoListe();
        liste.aufgaben = new Aufgabe[maxAnzahl];
        return liste;
    }
    
    
    // ADDS AN AUFGABE TO THE LIST
    public static boolean aufgabeHinzufuegen (TodoListe liste, String beschreibung) {
        
        // check if list is full, if so return false
        if (liste.indexEmpty == liste.aufgaben.length) {
            return false;
            
        }
        // if list is not full, add task and return true
        else {
            Aufgabe neueAufgabe = new Aufgabe(beschreibung);
            liste.aufgaben[liste.indexEmpty] = neueAufgabe;
            liste.indexEmpty++;
            return true;
        }
    }
    

    // RETURNS NUM OF ERL TASKS (nurErledigte true) OR ALL TASKS (false)
    public static int gibAnzahl (TodoListe liste, boolean nurErledigte) {
        
        // counts erledigte aufgaben
        if (nurErledigte) {
            int numAufgaben = 0;

            for (int i = 0; i < liste.indexEmpty; i++) {
                if (liste.aufgaben[i].erledigt) {
                    numAufgaben++;
                }
            }
            return numAufgaben;
        }
        // returns all aufgaben
        else {
            return liste.indexEmpty;
        }
    }
    

    // MARKS AUFGABE AS ERLEDIGT
    public static void markiereAlsErledigt (TodoListe liste, int index) {
        
        if (index > liste.indexEmpty || index < 0) {
            return;
        }
        else {
            liste.aufgaben[index].erledigt = true;
        }
    }
    

    // CREATES OUTPUT
    public static void ausgabe (TodoListe liste, int breiteInZeichen) {
        
        // output liste 
        for (int i = 0; i < liste.indexEmpty; i++) {
            if (liste.aufgaben[i].erledigt) {
                System.out.println("[x] " + liste.aufgaben[i].nameAufgabe);
            }
            else {
                System.out.println("[ ] " + liste.aufgaben[i].nameAufgabe);
            }
        }
        
        // create progressbar
        ProgressBar bar = new ProgressBar(gibAnzahl(liste, false), gibAnzahl(liste, true));
    /*
        // or without constructor:
        ProgressBar bar = new ProgressBar();
        bar.all = gibAnzahl(liste, false);
        bar.erl = gibAnzahl(liste, true);
    */


        // output progress
        System.out.println("Erledigt: " + ProgressBar.gibProzente(bar) + "%");
        System.out.println("Erledigt: " + ProgressBar.gibProgressBar(bar, breiteInZeichen));
    }
    

    // REMOVES AN AUFGABE
    public static void entferne (TodoListe liste, int index) {
        // check if index is in range
        if (index > liste.indexEmpty || index < 0) {
            return;
        }
        // remove Aufgabe, fill gap, decr. indexEmpty
        else {
            liste.aufgaben[index] = null;
            
            for (int i = index; i < liste.indexEmpty-1; i++) {
                liste.aufgaben[i] = liste.aufgaben[i+1];
            }
            liste.aufgaben[liste.aufgaben.length-1] = null;
            liste.indexEmpty--;
        }
    }
}
