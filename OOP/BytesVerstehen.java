public class BytesVerstehen {
    public static void main(String [] args) {

        byte test = 127;
        System.out.println(test);
        test ++; // test wird um 1 erhoeht
        System.out.println(test);
    }
}


/******************
 *  Output:       *
 *  ------------  *
 *  127           *
 *  -128          *
 ******************/