package com.harsha.coderbyte.easy;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order.
 *
 */
public class FirstReverse {
    public static String fReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(fReverse(s.nextLine()));
    }
}