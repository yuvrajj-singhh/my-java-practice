package ConditionalsandLoops_CalculatorProgram;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

    /*
            Syntax of for loops:

            for (initialisation; condition; increment/decrement) {
                // body
            }
        */

    // Q: Print numbers from 1 to n
//        Scanner input = new Scanner(System.in);
//        int n =input.nextInt();
//
//        for (int num = 1; num <= n; num ++) {
//            System.out.print(num + "  ");
//        }

//        while loops
        /*
            Syntax:
                while(condition){
                //body
             }
         */
//        int num = 1;
//        while(num <= 5){
//            System.out.println(num);
//            num += 1;
//        }

        // do while

        /*

            do{

            } while (condition);

         */
        int n=1;
        do {
            System.out.println(n);
            n++;
        } while (n != 4);


    }
}
