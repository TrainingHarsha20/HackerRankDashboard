package com.harsha.coderbyte.medium;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Have the function DistinctList(arr) take the array of numbers stored in arr and
 * determine the total number of duplicate entries.
 *
 * For example if the input is [1, 2, 2, 2, 3] then your program should output 2 because
 * there are two duplicates of one of the elements.
 */
public class DistinctList {

    static int distinctList(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }
        return  count;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(distinctList(new int[]{1, 2, 2, 2, 3}));
    }

}
