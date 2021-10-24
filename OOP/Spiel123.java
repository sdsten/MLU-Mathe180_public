/**********************************************************************
 *  Kleine Commandline appl. in Java zum Testen d. Loesung zu UB02-03 *
 *  Autor: SDW (aqvnp / 205 233 155), opensource via MIT License      *                        *
 *  Re: OOP Uebungsblatt 2, Aufgabe 3                                 * 
 **********************************************************************/

import java.util.Scanner;

public class Spiel123 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Game (1, 2, 3)");

        // Eingabe der Grenze
        int limit = 0;
        do {
            System.out.printf("Set limit (min 8): ");
            limit = scan.nextInt();
        } while (limit < 8);

        // Zahleneingaben der Spieler
        boolean isPlayer1 = true;
        int sum = 0;
        int num = 0;

        while (true) {
            do {
                System.out.printf("Player " + (isPlayer1 ? "1" : "2") + ": ");
                num = scan.nextInt();
            } while (num <=0 || num > 3);
            sum += num;
            if (sum > limit) {
                break;
            }
            isPlayer1 = !isPlayer1;
        }

        // Ausgabe des Gewinners und der Differenz
        int diff = sum - limit;
        System.out.printf("Player " + (isPlayer1 ? "1" : "2") + "lost.\nDifference: ");
        System.out.println(diff);
    }
};


/*******************************************************************
 *  Aufgabenstellung:                                              *
 *  Erstellen Sie einen Pseudocode, welcher das folgende           *
 *  kleine Spiel umsetzt:                                          *
 *  • es gibt zwei Spieler, welche abwechselnd eine ganze          *
 *  Zahl zwischen 1 und 3 wählen                                   *
 *  • die gewählten Zahlen werden immer zusammenaddiert            *
 *  • wird dabei eine zuvor festgelegte obere Grenze               *
 *  überschritten, so hat der Spieler verloren, welcher zuletzt    *
 *  eine Zahl gewählt hat                                          *
 *  Es wird zuerst eine obere Grenze eingelesen (zuvor             *
 *  Ausgabe ‘Grenze:‘), welche mindestens 8 sein muss. Solange     *
 *  eine kleinere Zahl eingegeben wird, muss erneut eine Zahl      *
 *  eingegeben werden (wobei jedesmal Ausgabe ‘Grenze:‘ erfolgt).  *
 *  Anschließend beginnt das Spiel. Die Spieler, bei Spieler 1     *
 *  beginnend, wechseln sich nacheinander ab (wobei jedesmal       *
 *  ausgegeben wird, welcher Spieler dran ist) und wählen jeweils  *
 *  eine Zahl zwischen 1 und 3. Immer wenn eine andere Zahl        *
 *  eingegeben wird, muss der entsprechende Spieler erneut eine    *
 *  Zahl eingeben. Akzeptierte Eingaben werden zu den vorherigen   *
 *  aufaddiert. Sobald ein Spieler dadurch die obere Grenze        *
 *  überschreitet, wird ausgegeben welcher Spieler verloren hat    *
 *  und um wie viel die obere Grenze überschritten wurde           * 
 *  (nur die Zahl).                                                *
 *******************************************************************/