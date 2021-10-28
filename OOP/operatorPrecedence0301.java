/**********************************************************************
 *  Praktischer Test meiner Loesung zu UB03-01                        *
 *  Autor: SDW                                                        *
 *  Re: OOP Uebungsblatt 3, Aufgabe 1 (Operator Precedence)           * 
 **********************************************************************/

import java.util.Scanner;

public class operatorPrecedence0301 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        // values
        int i = 8;
        int j = 3;
        int k = 2;
        double f = 1.5;          // kd
        double g = 4.25;         // ld
        double h = 0.0;          // md - missing on the Uebungsblatt
        boolean a = true;
        boolean b = false;

        // expressions
        System.out.println(i % j - i * k + i);
        System.out.println((((i % j) - (i * k)) + i));
        //System.out.println(h % k + kd);
        //System.out.println(((h % k) + kd));
        System.out.println(!b && a || b && !a);
        System.out.println((((!b) && a) || (b && (!a))));
        System.out.println(j++ - i * k / i);
        j = 3;   // incr. operators change the value so this is to set them back
        System.out.println(((j++) - ((i * k) / i)));
        j = 3;
        System.out.println(j - ++i * k / i);
        i = 8;
        System.out.println((j - (((++i) * k) / i)));
        i = 8;
        System.out.println(0 < -k || a == false ^ b == true);
        System.out.println(((0 < (-k)) || ((a == false) ^ (b == true))));
        System.out.println(i <= k * j & a);
        System.out.println(((i <= (k * j)) & a));



    }
};


/*******************************************************************
 *  Aufgabenstellung:                                              *
 *  Paranthecize and determine value of expressions                *
 *  Values:                                                        *
 *  i = 8; kd = 1.5; a = true                                      *
 *  j = 3; ld = 4.25; b = false                                    *
 *  k = 2;                                                          *
 *  Expressions:                                                   *
 *  1. i % j - i * k + i                                           *
 *  2. md % k + kd                                                 *
 *  3. !b && a || b && !a                                          *
 *  4. j++ - i * k / i                                             *
 *  5. j - ++i * k / i                                             *
 *  6. 0 < -k || a == false ^ b == true                            *
 *  7. i <= k * j & a                                              *
 *******************************************************************/