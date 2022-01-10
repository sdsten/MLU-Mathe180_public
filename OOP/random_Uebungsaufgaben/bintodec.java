//OOP Uebungsblatt 5 Aufgabe 1
import java.lang.Math;
public class bintodec {
    public static void main(String[] args) {
        
        // To test without console parameters use these..
        // int num = 42;
        // String prefix = "dez";
        // ..and comment out the following two.

        String prefix =  args[0]; 
        int num = Integer.parseInt(args[1]);

        int result = 0;

        if (prefix.equals("bin")) {
            for (int i = 0; num > 0; i++) {
                int lastDigit = num % 10;
                result += (lastDigit * Math.pow(2, i));
                num /= 10;
            }
        }
        else if (prefix.equals("dez")) {
        for (int i = 0; num > 0; i++) {
                int remainder = num % 2;
                num /= 2;
                result += (remainder * Math.pow(10, i));
            }

        }
        else {
            System.out.println("Error: Invalid Prefix.");
        }

        System.out.println(result);
    }
}


/************************
Aufgabenstellung
Erstellen Sie ein Programm, welches als Kommandozeilenparameter zwei Werte erhält. 
Der erste gibt an, ob es sich um eine Binärzahl (bin) handelt, oder um eine 
Dezimalzahl (dez). Der zweite ist die Binär- bzw. Dezimalzahl selbst. Ihr Programm 
soll die Binärzahl bzw. Dezimalzahl anschließend in eine Dezimalzahl bzw. Binärzahl 
umwandeln und auf der Konsole ausgeben.

Hinweis: Wenn der Parameter in Ihrer main-Methode args heißt, dann können Sie auf
 den ersten Kommandozeilenparameter per args[0] und auf den zweiten per args[1] 
 zugreifen. Beachten Sie, dass jeweils eine Zeichenkette zurückgegeben wird. 
 Eine Zeichenkette können Sie mittels Integer.parseInt in eine ganze Zahl umwandeln.

Umwandlung einer Binärzahl in eine Dezimalzahl
Jede Binärzahl kann leicht als Summe von Zweierpotenzen dargestellt werden, 
womit sich die Dezimalzahl ergibt. Dazu wird jede Ziffer mit ihrem Stellenwert 
multipliziert [...]

Umwandlung einer Dezimalzahl in eine Binärzahl
Die Binärzahl erhält man, indem man die Dezimalzahl durch 2 teilt. Man fährt immer 
mit dem ganzteiligen Ergebnis fort, wobei der jeweilige Rest die entsprechende 
Ziffer der Binärzahl darstellt. [...]
******************************/