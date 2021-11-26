// UeB 6, Aufgabe 2, FINISHED, all tests pass, no commas at the end

import java.util.Scanner;

public class Statistik {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        
        // get number of diff. ints and total number of inputs
        int arraySize = Integer.parseInt(args[0]);
        int numInputs = Integer.parseInt(args[1]); 
        
        // create arrays and vars that have to be outside the loop
        int[] numbers = new int[arraySize];
        int[] numCount = new int[arraySize];
        int endOfData = 0;
        
        // get input and check it for property new (store) or repeated (incr count)
        for (int i = 0; i < numInputs; i++) {
            
            int num = in.nextInt();
            int numIndex = 0;
            boolean isNewNum = true;
            
            // check if num is new (note that by not changing isNewNum) or repeating (!isNewNum and get index)
            for (int j = 0; j < endOfData; j++) {
                if (num == numbers[j]) {
                    isNewNum = false;
                    numIndex = j;
                    break;
                }
            }

            // store new nums and set count to 1, incr count for old nums
            if (isNewNum) {
                numbers[endOfData] = num;
                numCount[endOfData] = 1;
                endOfData++;
            }
            else {
                numCount[numIndex]++;
            }
        }

        // print arrays, without comma at the end
        for (int i = 0; i < numbers.length && numCount[i] != 0; i++) {
                System.out.printf(numbers[i] + ((i == (endOfData-1)) ? "" : ", "));   
        }
        System.out.println();
        
        for (int i = 0; i < numbers.length && numCount[i] != 0; i++) {
                System.out.printf(numCount[i] + ((i == (endOfData-1)) ? "" : ", "));  
        }
        System.out.println();
        
    }
}



/************************************************************
 * Changelog:                                               *
 * 21.11.21: skeleton version finished (working)            *
 * 22.11.21: removed commas at the end of output            *
 *           Issue: initializer-0s and data-0s cant be      *
 *           distinguished, causes bug with ?: at the end   *
 * 22.11.21: workaround for prev. Issue: manual random      *
 *           initializer for numbers array                  *
 * 23.11.21: fixed issue, removed workaround,               *
 *           not pretty but good enough                     *
 * **********************************************************/