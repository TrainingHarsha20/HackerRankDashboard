package com.harsha.hackerrank.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

/**
 *
 * Given Binary Array.
 * Find max length of continuous number of sub array with equal number of 0 or 1
 *
 * Input: [0,1,0]
 * OutPut: 2
 *
 * Explanation: [0, 1] or [1, 0] is the longest continuous sub array with equal number of 0 or 1
 */

public class CodingInterviewSECapitalOne {

    public static void main(String[] args) {
//        int[] arr = {0, 1, 0, 1, 0, 1, 0};
//        int[] arr= {0,0,0,0};
//        int[] arr= {1,1,1,1};
//        int[] arr = {0, 1, 0};
//        int[] arr = {};
        int[] arr = {0, 0, 0, 1, 1, 1};
        longestContinuousArray(arr);
    }

    private static void longestContinuousArray(int[] arr) {
        if(arr.length < 1) return;
        int maxLen =0, sum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, -1);

        for(int i=0; i< arr.length;i++) {
            if (arr[i] == 0) sum--;
            else sum++;

            if(map.containsKey(sum)){

                System.out.println("i - map.get(sum) ::" + (i - map.get(sum)) + " i = " + i);
                maxLen = Math.max(maxLen, i - map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        System.out.println("count ::" + maxLen );
    }
}