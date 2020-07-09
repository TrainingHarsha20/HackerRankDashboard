package com.harsha.coderbyte.easy;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Have the function SwapCase(str) take the str parameter and swap the case of each character.
 * For example: if str is "Hello World" the output should be hELLO wORLD.
 * Let numbers and symbols stay the way they are.
 *
 */
public class SwapCase {
    static String showCase(String str){
        final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String LOWER = UPPER.toLowerCase();

        StringBuilder result = new StringBuilder("");
        for (char c : str.toCharArray()) {
            int index = UPPER.indexOf(c);
            if (index != -1) {
                result.append(LOWER.charAt(index));
            } else {
                index = LOWER.indexOf(c);
                if (index != -1) {
                    result.append(UPPER.charAt(index));
                } else {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(showCase(s.nextLine()));
    }

}
