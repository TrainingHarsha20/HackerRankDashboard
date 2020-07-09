package com.harsha.coderbyte.easy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Have the function SecondGreatLow(arr) take the array of numbers stored in arr and
 * return the second lowest and second greatest numbers, respectively, separated by a space.
 * For example: if arr contains [7, 7, 12, 98, 106] the output should be 12 98.
 *
 * The array will not be empty and will contain at least 2 numbers.
 * It can get tricky if there's just two numbers!
 *
 */
public class SecondGreatLow {

    private static String secondGreatLow(int[] arr) {
        StringBuilder sb = new StringBuilder();
        if(arr.length == 2){
            sb.append(arr[0]).append(" ").append(arr[1]);

        }
        Arrays.sort(arr);
        int lowest = Integer.MIN_VALUE, highest = Integer.MAX_VALUE;
        int lowestCount =0,highestCount = 0;
   /*     AtomicInteger lowestCount = new AtomicInteger();
        int highestCount = 0;
        IntStream.of(arr).filter(nr -> {
            lowestCount.getAndIncrement();
            lowest = nr;
            if (lowestCount.get() == 2) break;
        })*/

        for (int nr : arr) {
            if(nr > lowest){
                lowestCount++;
                lowest = nr;
                if (lowestCount == 2) break;
            }
        }
        for (int nr : arr) {
            if(highest > nr){
                highestCount++;
                highestCount = nr;
                if (highestCount == 2) break;
            }
        }
        return  lowest + " " + highest;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int[] input = new int[]{7, 7, 12, 98, 106};
        System.out.println(secondGreatLow(input));
    }
}
