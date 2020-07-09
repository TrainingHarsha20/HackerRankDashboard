package com.harsha.coderbyte.easy;

import java.util.Scanner;

import static java.util.Arrays.stream;

/**
 * Have the function NumberSearch(str) take the str parameter,
 * search for all the numbers in the string, add them together, then return that final number.
 *
 * For example: if str is "88Hello 3World!" the output should be 91.
 * You will have to differentiate between single digit numbers and multiple digit numbers like in the example above.
 * So "55Hello" and "5Hello 5" should return two different answers.
 * Each string will contain at least one letter or symbol.
 *
 */

public class NumberAddition {
    public static int findMode(String str) {
        String NUMBERS = "0123456789";
        int sum = 0;

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
            if (NUMBERS.indexOf(chars[i]) != -1) {
                sb.append(chars[i]);
                if (i == chars.length - 1) {
                    sum += Integer.valueOf(sb.toString());
                }
            } else if (sb.length() != 0) {
                sum += Integer.valueOf(sb.toString());
                sb.setLength(0);
            }
        }

        return sum;
    }


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println(findMode(s.nextLine()));
        System.out.println(findMode("88Hello 3World!"));

    }
}
