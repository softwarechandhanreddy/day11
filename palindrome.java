package com.codegnan.controlstatements;

public class palindrome{
    public static void main(String[] args) {
        String str = "121";
        String original = str.toLowerCase(); // case-insensitive
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
