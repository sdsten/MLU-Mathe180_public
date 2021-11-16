/****************************************************************
 * Checks if a single word is a palindrome                      *
 * Little testing program Re: OOP UeBlatt 5, Aufgabe 2          *
 * Does NOT work with spaces (ie. doesn't work with sentences)  *
 ****************************************************************/
public class palindrome {
    public static void main(String[] args) {

        String text = args[0].toLowerCase();
        int count = 0;

        System.out.println(text);
        System.out.println(text.length());

        for (int i = 0; i <= (text.length()/2); i++) {
            if (text.charAt(i) == (text.charAt(text.length() - (i+1)))) {
                count++;
            }
            else
                break;

        }

        if (count >= text.length()/2) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
            System.out.println(count);
        }
    }
}