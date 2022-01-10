// UeB 6, Aufgabe 1, FINISHED, all tests pass

public class Buchstabenhaeufigkeit {
    public static void main(String[] args) {

        // parse string-arguments lowercase only to not have to worry about capital letters
        String caesarString = args[0].toLowerCase();
        String commonClear = args[1].toLowerCase(); 
        
        int[] occurrences = new int[26];
        
        // count occurrences of each character in caesar-string        
        for (int i = 0; i < caesarString.length(); i++) {
            
            char ch = caesarString.charAt(i);
            
            // only consider a - z lowercase, ignore everything else
            if (ch >= 'a' && ch <= 'z') {
                occurrences[ch - 'a']++;
            }
        }
        
        // find caesar-equivalent to most common clear char
        int highestCount = 0;
        int highestCountIndex = 0;
        
        for (int i = 0; i < occurrences.length; i++) {
             if (occurrences[i] > highestCount) {
                highestCount = occurrences[i];
                highestCountIndex = i;
             }
        }
        
        // print most common caesar char
        char mostCommonChar = (char)('a'+highestCountIndex);
        System.out.println(mostCommonChar);
        
        // find and print shifts between commonClear and most common caesar char
        for (int i = 0; i < commonClear.length(); i++) {
        
            if (commonClear.charAt(i) < 'a'+highestCountIndex) {

                System.out.println(('a'+highestCountIndex)-commonClear.charAt(i));
            }
            else {
                // mod26 fixes 0-shifts being printed as 26-shifts
                System.out.println((26 - (commonClear.charAt(i)-('a'+highestCountIndex)))%26);
            }
        }
    }
}



/************************************************************
 * Changelog:                                               *
 * 21.11.21: skeleton version finished (working)            *
 *           Issue1: off-by-one error in occurences         *
 *           Issue2: 0-shift is printed as 26-shift         *
 * 22.11.21: fixed Issues, finished                         *
 *           not pretty but good enough                     *
 * **********************************************************/