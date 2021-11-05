public class operatorPrecedence {
    public static void main(String args[]) {

        // values
        int i = 8;
        int j = 3;
        int k = 2;
        double kd = 1.5;          
        double ld = 4.25;         
        boolean a = true;
        boolean b = false;

        // expressions
        System.out.println(i % j - i * k + i);
        System.out.println((((i % j) - (i * k)) + i));
        System.out.println(ld % k + kd);
        System.out.println(((ld % k) + kd));
        System.out.println(!b && a || b && !a);
        System.out.println((((!b) && a) || (b && (!a))));
        System.out.println(j++ - i * k / i);
        // incr. operators have side-effects so this is to 'reset' them
        j = 3;
        System.out.println(((j++) - ((i * k) / i)));
        j = 3;
        System.out.println(j - ++i * k / i);
        i = 8;
        System.out.println((j - (((++i) * k) / i)));
        System.out.println(0 < -k || a == false ^ b == true);
        System.out.println(((0 < (-k)) || ((a == false) ^ (b == true))));
        System.out.println(i <= k * j & a);
        System.out.println(((i <= (k * j)) & a));
    }
};