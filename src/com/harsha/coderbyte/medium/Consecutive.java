package com.harsha.coderbyte.medium;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Have the function Consecutive(arr) take the array of integers stored in arr and
 * return the minimum number of integers needed to make the contents of arr consecutive
 * from the lowest number to the highest number.
 *
 * For example: If arr contains [4, 8, 6] then the output should be 2 because
 * two numbers need to be added to the array (5 and 7) to make it a consecutive array of numbers from 4 to 8.
 *
 * Negative numbers may be entered as parameters and no array will have less than 2 elements.
 *
 */
public class Consecutive {

    static int minConsecutive(int[] arr){
        Arrays.sort(arr);
        int amount = 0, previous = arr[0];
        for (int i = 1; i < arr.length; i++) {
            amount += Math.abs(arr[i] - arr[i - 1]) - 1;
        }
        return amount;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(minConsecutive(new int[]{4,8,6}));
//        System.out.print(minConsecutive(new int[]{4,8,10}));
//        System.out.print(minConsecutive(new int[]{1,5,9,11}));
    }

}
