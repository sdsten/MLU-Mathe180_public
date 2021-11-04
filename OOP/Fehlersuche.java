import java.util.Scanner;
public class Fehlersuche {
    static final int loesung = 42;          // identifier and value swapped

    public static void main(String [] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Die␣halbe␣Wahrheit␣ist:␣");
        int hW = in.nextInt ();             // added missing type
        int antwort;
                                            // removed useless hW declaration
        antwort = 2 * hW;                   //  changed 2.0 to 2
        if(antwort == 42) System.out.println("Korrekt!"); // changed = to ==
        else System.out.println("Falsch");
    }
}