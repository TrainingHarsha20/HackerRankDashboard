package com.harsha.coderbyte.medium;

import java.util.Scanner;

/**
 * Have the function NumberEncoding(str) take the str parameter and encode the message according to the following rule:
 * encode every letter into its corresponding numbered position in the alphabet.
 * Symbols and spaces will also be used in the input.
 * For example: if str is "af5c a#!" then your program should return 1653 1#!.
 */
public class NumberEncoding {
    final static String LOWER = "abcdefghijklmnopqrstuvwxyz";
    final static String UPPER = LOWER.toUpperCase();

    static String numberEncoding(String str) {

        StringBuilder result = new StringBuilder("");

        for (char c : str.toCharArray()) {
            int index = LOWER.indexOf(c);
            if (index != -1) {
                result.append(index + 1);
            } else {
                index = UPPER.indexOf(c);
                if (index != -1) {
                    result.append(index + 1);
                } else {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(numberEncoding("af5c a#!"));
    }

}
