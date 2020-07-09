package com.harsha.hackerrank.interview;

/**
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).
 *
 * Example 1:
 * Input: [1,3,5,4,7]
 * Output: 3
 *
 * Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
 * Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4.
 *
 * Example 2:
 * Input: [2,2,2,2,2]
 * Output: 1
 *
 * Explanation: The longest continuous increasing subsequence is [2], its length is 1.
 * Note: Length of the array will not exceed 10,000.
 */

public class LongestContinuousIncreasingSubsequence {

    /*public static int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;

        int result =1, anchor =1;
        for(int i=1; i<nums.length; i++){
            anchor = nums[i] >= nums[i-1] ? anchor+1 : anchor;
            result = Math.max(result, anchor);
        }

        return result;
    }*/
    public static int lengthofLIS(int[] nums) {
        return lengthofLIS(nums, Integer.MIN_VALUE, 0);
    }

    public static int lengthofLIS(int[] nums, int prev, int curpos) {
        if (curpos == nums.length) {
            return 0;
        }
        int taken = 0;
        if (nums[curpos] > prev) {
            taken = 1 + lengthofLIS(nums, nums[curpos], curpos + 1);
        }
        int nottaken = lengthofLIS(nums, prev, curpos + 1);
        return Math.max(taken, nottaken);
    }
    public static void main(String[] args){
        System.out.println( " Longest Continuous Increasing Subsequence : " + lengthofLIS(new int[]{1,3,5,4,7}));
        System.out.println( " Longest Continuous Increasing Subsequence : " + lengthofLIS(new int[]{2,2,2,2}));
        System.out.println( " Longest Continuous Increasing Subsequence : " + lengthofLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
