package com.harsha.coderbyte.medium;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Have the function NumberSearch(str) take the str parameter, search for all the numbers in the string,
 * add them together, then return that final number divided by the total amount of letters in the string.
 *
 * For example: if str is "Hello6 9World 2, Nic8e D7ay!" the output should be 2.
 *
 * First if you add up all the numbers, 6 + 9 + 2 + 8 + 7 you get 32.
 * Then there are 17 letters in the string. 32 / 17 = 1.882,
 * and the final answer should be rounded to the nearest whole number, so the answer is 2.
 *
 * Only single digit numbers separated by spaces will be used throughout the whole string
 * (So this won't ever be the case: hello44444 world).
 * Each string will also have at least one letter.
 */
public class NumberSearch {

    static int numbersearch(String str){
        String NUMBERS = "0123456789";
        final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String LOWER = UPPER.toLowerCase();
        double sum = 0;
        int charCount = 0;

        for (char c : str.toCharArray()) {
            if (NUMBERS.indexOf(c) != -1) {
                sum += Integer.valueOf(String.valueOf(c));
            } else if (UPPER.indexOf(c) != -1 || LOWER.indexOf(c) != -1) {
                charCount++;
            }
        }
        return (int) Math.round(sum / charCount);
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(numbersearch("Hello6 9World 2, Nic8e D7ay!"));
        System.out.println(numbersearch("hello44444 world"));
    }

    public static class ParallelStream {

        public static void main(String[] args) {
            List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
            //get count of empty string
            long count = strings.parallelStream().filter(s -> s.isEmpty()).count();
            //It is very easy to switch between sequential and parallel streams.
            System.out.println("count ::"+ count);

            long nCount = strings.stream().filter(s -> s.isEmpty()).count();
            System.out.println("count ::"+ nCount);
        }
    }
}
