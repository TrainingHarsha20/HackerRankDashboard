package com.harsha.leetcoder.easy;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

     public int[] onePassSolution(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //Not Good approach. it will not pass all testcases
    public String twoSum(int[] nums, int target) {

        int[] out = new int[2];
        int first = nums[0];
        int firstIdx = 0;
        int diff = target - first;
        StringBuilder sb = new StringBuilder();
        for(int i =1; i< nums.length;i ++){
            if(diff - nums[i] == 0) {
                sb.append(firstIdx).append(" , ").append(i);
            } else{
                first = nums[i];
                firstIdx = i;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        TwoSum ts = new TwoSum();
        System.out.println(ts.twoSum(new int[]{2, 7, 11, 15}, 9));
//        int[] op = ts.onePassSolution(new int[]{2, 7, 11, 15}, 9);
        int[] op = ts.onePassSolution(new int[]{3,2,4}, 6);
        System.out.println(op);

    }
}