package ConditionalsandLoops_CalculatorProgram;

import java.util.Scanner;

public class CountingOccurunces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number to search in
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Read the digit to look for
        System.out.print("Enter the digit you want to count (0-9): ");
        int d = scanner.nextInt();

        if (d < 0 || d > 9) {
            System.out.println("Invalid digit! Please enter a digit between 0 and 9.");
            return;
        }

        int count = 0;
        int N = n; // Preserve the original number for display

        // Handle negative numbers by converting to positive
        n = Math.abs(n);

        // Special case: if number is 0, check if digit is 0
        if (n == 0 && d == 0) {
            count = 1;
        } else {
            while (n > 0) {
                int digit = n % 10;
                if (digit == d) {
                    count++;
                }
                n = n / 10;
            }
        }
        System.out.println("Digit " + d + " occurred " + count + " times in number " + N);
    }
}