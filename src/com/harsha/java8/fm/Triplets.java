package com.harsha.java8.fm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a list of numbers,
 * write an algorithm to find all the triples and pairs of numbers in the list that equal exactly 13
 *
 * Input array: [7, 12, 3, 1, 2, -6, 5, -8, 6]
 * Target sum: 0
 *
 * Output: [[2, -8, 6], [3, 5, -8], [1, -6, 5]]
 *
 */
public class Triplets {

//    Stream()
//        fork and join --> concurrent

    private static List<Integer[]> findThreeSum(int[] nums, int target) {
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int currentTarget = target - nums[i];
            Set<Integer> existingNums = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                if (existingNums.contains(currentTarget - nums[j])) {
                    result.add(new Integer[] { nums[i], nums[j], currentTarget - nums[j] });
                } else {
                    existingNums.add(nums[j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(findThreeSum(new int[]{7, 12, 3, 1, 2, -6, 5, -8, 6}, 0).size()-1);
    }
}
