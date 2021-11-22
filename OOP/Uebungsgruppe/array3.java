public class array3 {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 5};
        int [] b = {1, 3, 3, 4, 5};

        boolean gleich = true;

        for (int i = 0; i < a.length && gleich; i++) {
            if (a[i] != b[i]) {
                gleich = false;
            }
        }

        if (gleich) {
            System.out.println ("Beide Arrays haben den gleichen Inhalt.");
        }
        else {
            System.out.println ("Beide Arrays haben nicht den gleichen Inhalt.");
        }
    }
}