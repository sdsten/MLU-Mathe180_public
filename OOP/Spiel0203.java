import java.util.Scanner;

public class Spiel0203 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Spiel 1,2,3 - UB 2, Aufgabe 3");

        // Eingabe der Grenze
        int limit = 0;
        do {
            System.out.printf("Grenze (min 8): ");
            limit = scan.nextInt();
        } while (limit < 8);

        // Zahleneingaben der Spieler
        boolean isPlayer1 = true;   // um festzuhalten wer zuletzt dran war
        int sum = 0;
        int num = 0;

        while (limit >= sum) {
            do {
                System.out.printf("Spieler " + (isPlayer1 ? "1: " : "2: "));
                num = scan.nextInt();
            } while (num <=0 || num > 3);
            sum += num;
            if (sum > limit) {
                break;
            }
            isPlayer1 = !isPlayer1;
        }

        // Ausgabe des Gewinners und der Differenz
        System.out.println("Spieler " + (isPlayer1 ? "1" : "2") + " hat verloren.");
        System.out.println(sum - limit);
    }
};