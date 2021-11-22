public class array1 {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 5};
        int [] b = {6, 7, 8, 9, 10};
        int [] c = null;

        System.out.println (a);
        System.out.println (b);
        System.out.println (c);

        c = a;

        System.out.println (a);
        System.out.println (c);

        a[0] = 55;
        System.out.println("c[0] = " + c[0]);
    }
}