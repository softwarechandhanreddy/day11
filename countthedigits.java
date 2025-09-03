package com.codegnan.controlstatements;

public class countthedigits {
    public static void main(String[] args) {
        int num = 12345;  // You can change this number or take input using Scanner
        int count = 0;
        int temp = num;

        if (temp == 0) {
            count = 1; // Special case if the number is 0
        } else {
            while (temp != 0) {
                temp /= 10;  // Remove last digit
                count++;
            }
        }

        System.out.println("Number of digits in " + num + " is: " + count);
    }
}
