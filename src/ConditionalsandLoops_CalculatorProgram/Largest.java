package ConditionalsandLoops_CalculatorProgram;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //find largest number out of 3
//
//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
        int max = Math.max(c, Math.max(a,b));

        System. out. println (max) ;
    }
}
