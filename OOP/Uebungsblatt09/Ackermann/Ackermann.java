// Uebungsblatt 9, Bonus-Aufgabe, finished

public class Ackermann {
    
    public static int ack (int n, int m) {
        
        int result = 0;
        
        if (n == 0) {
            result = m + 1;
        }
        else if ((n > 0) && (m == 0)) {
            result = ack(n-1, 1);
        }
        else {
            result = ack(n-1, ack(n, m-1));
        }
        
        return result;
    }
    
    public static void main (String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        
        int result = ack(n, m);
        System.out.println(result);
    }
}