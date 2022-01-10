// UNfinished, work in progress


public class caesar {
    public static void main(String[] args) {

        // parse String-arguments lowercase only
        String caesarString = args[0].toLowerCase();
        String commonClear = args[1].toLowerCase(); 
        
        int[] occurrences = new int[26];
        
        for (int i = 0; i < caesarString.length(); i++) {
            
            char ch = caesarString.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                occurrences[ch - 'a']++;
            }
        }
        
        int highestCount = 0;
        int highestCountIndex = 0;
        
        for (int i = 0; i < occurrences.length; i++) {
             if (occurrences[i] > highestCount) {
                highestCount = occurrences[i];
                highestCountIndex = i;
             }
        }
        
        char mostCommonChar = (char)('a'+highestCountIndex);
        System.out.println(mostCommonChar);
        
        for (int i = 0; i < commonClear.length(); i++) {
        
            if (commonClear.charAt(i) > highestCountIndex) {

                System.out.println('a'-(commonClear.charAt(i)-highestCountIndex));
            }
            else {
                System.out.println('a'-(highestCountIndex-commonClear.charAt(i)));
            }
        }
    }
}

// UeB 06, Aufgabe 1
