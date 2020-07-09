package com.harsha.leetcoder.easy;

import java.util.stream.IntStream;

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written.
 *
 * Do the above modifications to the input array in place, do not return anything from your function.
 *
 * Example 1:
 *
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 *
 * Example 2:
 *
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 *
 *
 * Note:
 *
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 */
public class DuplicateZeros {

    public static int[] dupZeros(int[] nums){
        int zeroCount = 0;
        for(int i : nums){
            if(i == 0) zeroCount++;
        }

        int i = nums.length -1, j = i+zeroCount;

        while( i != j){
            insert(nums, i , j--);
            if(nums[i] ==0){
                insert(nums, i , j--);
            }
            i--;
        }
        return nums;
    }

    private static void insert(int[] nums, int i, int j) {
        if(j < nums.length){
            nums[j] = nums[i];
        }
    }

    public static void main(String[] args){
        System.out.println("test : " + dupZeros(new int[]{1,0,2,3,0,4,5,0}));
        IntStream.of(dupZeros(new int[]{1,0,2,3,0,4,5,0})).forEach(System.out::println);

    }
}
