package com.codegnan.controlstatements;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        int original = num; // Keep the original number for display

        while (num != 0) {
            int digit = num % 10; // Get last digit
            sum += digit;         // Add to sum
            num /= 10;            // Remove last digit
        }

        System.out.println("Sum of digits in " + original + " is: " + sum);
        
        sc.close();
    }
}
