package ConditionalsandLoops_CalculatorProgram;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        /*
            Syntax of if statements;
            if (boolean expressions -> T or F) {
                //body
            } else {
                //do this
            }
         */
            Scanner input = new Scanner(System.in);
        int salary = input.nextInt();;
        if (salary > 30000) {
            salary += 2000;
        } else if (salary>20000) {
            salary += 3000;
        } else{
            salary += 500;
        }
        System.out.println(salary);
    }
}
