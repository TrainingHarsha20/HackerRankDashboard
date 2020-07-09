package com.harsha.coderbyte.easy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static java.util.stream.StreamSupport.stream;

/**
 * Have the function MeanMode(arr) take the array of numbers stored in arr and
 * return 1 if the mode equals the mean,
 * 0 if they don't equal each other
 * (ie. [5, 3, 3, 3, 1] should return 1 because the mode (3) equals the mean (3)).
 * The array will not be empty, will only contain positive integers, and will not contain more than one mode.
 *
 * [15, 24, 49, 8, 50]
 * Mean mode --> Sum of all numbers/length of array --> (15+24+49+8+50)/5 = 29.2
 * Median    --> get middle of the number by Sort Array in ascending --> 24
 * Mode      --> Repeated numbers   -- No
 * Range     --> Max(greastes) - min (lowest)  --> 50 -8 = 42
 *
 */

public class MeanMode {
    public static String findMode(int[] arr) {
        Arrays.sort(arr);
        String t8 = java8Code(arr);
        String t = beforeJava8Code(arr);
        return t8;
    }
    //Java8 Code
    private static String java8Code(int[] arr) {
        AtomicInteger numC = new AtomicInteger();
        AtomicInteger hCount = new AtomicInteger();
        AtomicInteger pNum = new AtomicInteger(arr[0]);
        AtomicInteger mean = new AtomicInteger();
        AtomicInteger mode = new AtomicInteger();

        IntStream.of(arr).forEach(num -> {
            mean.set(mean.get()+num);

            if (num == pNum.get()) {
                numC.set(numC.getAndIncrement());
            } else {
                pNum.set(num);
                numC.set(1);
            }
            if (numC.get() > hCount.get()) {
                mode.set(pNum.get());
                hCount.set(numC.get());
            }
        });

        mean.set(mean.get()/arr.length);
        return mean.get() == mode.get() ? "1" : "0";
    }

    private static String beforeJava8Code(int[] arr) {
        //      Before Java8 Code
        int mean = 0, mode = 0;
        int prevNum = arr[0], numCount = 0, highestCount = 0;
        for (int num : arr) {
            mean += num;

            if (num == prevNum) {
                numCount++;
            } else {
                prevNum = num;
                numCount = 1;
            }

            if (numCount > highestCount) {
                mode = prevNum;
                highestCount = numCount;
            }
        }
        mean /= arr.length;
        return mean == mode ? "1" : "0";
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println(findMode(new int[]{15, 24, 49, 8, 50}));
        System.out.println(findMode(new int[]{5, 3, 3, 3, 1}));
    }
}
