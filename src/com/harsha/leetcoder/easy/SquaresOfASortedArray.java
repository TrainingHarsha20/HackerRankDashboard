package com.harsha.leetcoder.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Example 2:
 *
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 * Note:
 *
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A is sorted in non-decreasing order.
 */
public class SquaresOfASortedArray {
    public static int[] sortedSquares(int[] A) {
        int[] intList = new int[A.length];

        for(int i =0; i<A.length; i++){
            intList[i] = A[i]*A[i];
        }
        Arrays.sort(intList);
        return intList;
    }

    public static void main(String[] args){
        IntStream.of(sortedSquares(new int[]{-4, -1, 0, 3, 10})).forEach(System.out::println);
    }
}
