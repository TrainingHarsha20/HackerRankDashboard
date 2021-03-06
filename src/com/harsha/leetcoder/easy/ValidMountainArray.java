package com.harsha.leetcoder.easy;

/**
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 *
 * Recall that A is a mountain array if and only if:
 *
 * A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 *
 * Example 1:
 *
 * Input: [2,1]
 * Output: false
 * Example 2:
 *
 * Input: [3,5,5]
 * Output: false
 * Example 3:
 *
 * Input: [0,3,2,1]
 * Output: true
 *
 *
 * Note:
 *
 * 0 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 *
 */
public class ValidMountainArray {

    public static boolean validMountainArray(int[] A) {
        if(A.length == 2 ) return A[0]>A[1];

        int count = 0;
        int mid = A.length/2;
        for(int i=1; i<A.length; i++){
            if(A[i] > A[i-1]) count++;

            if(i > mid && A[i] < A[i-1]){
                count--;
            }
        }

        return count == 0 ? true: false;

    }

    public static void main(String[] args){
        System.out.println(validMountainArray(new int[]{}));
    }
}
