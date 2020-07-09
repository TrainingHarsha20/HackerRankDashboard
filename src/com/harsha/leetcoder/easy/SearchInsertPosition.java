package com.harsha.leetcoder.easy;

import java.io.IOException;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Example 1:
 *
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 *
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 *
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 *
 * Input: [1,3,5,6], 0
 * Output: 0
 */
public class SearchInsertPosition {

    //Matching  then return i
    //Target is in between i and i+1 then return i;
    //Target is grater than all elements in array so return i+1
    public int searchInsert(int[] nums, int target) {

        if(nums[nums.length-1] < target) return nums.length;
        for(int i=0; i<nums.length-1;i++){
            //matching
            if(nums[i] == target) return i;

            if( nums[i+1] >= target && nums[i] < target){
                return ++i;

            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        SearchInsertPosition ri = new SearchInsertPosition();
        System.out.println( " prefix:: " + ri.searchInsert(new int[]{1,3},3));
        System.out.println( " prefix:: " + ri.searchInsert(new int[]{1,3,5,6},2));
        System.out.println( " prefix:: " + ri.searchInsert(new int[]{1,3,5,6},7));
    }



}
