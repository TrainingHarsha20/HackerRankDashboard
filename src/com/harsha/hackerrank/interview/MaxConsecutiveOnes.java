package com.harsha.hackerrank.interview;

import java.util.*;

/**
 *
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 *     The maximum number of consecutive 1s is 3.
 * Note:
 *
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */
public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
/*
        if(arr.length < 1) return 0;
        int maxLen =0, sum = 0;
        ArrayList<int[]> list = new ArrayList<>();
        int first = arr[0];
        for(int i = 1; i<arr.length; i++){

            if(list.size() < 1){
                list.add(new int[]{first, arr[i]});
            }
            int len = list.size();
            int j = 0;
            while(len > 0){
                list.size();
                int[] subArray = list.get(j);
                System.out.println( "subArray[0] : " + subArray[0]  + " subArray[1] ::" + subArray[1] );
                if(subArray[0] == first && subArray[1] == arr[i]){
                    break;
                }else{
                    list.add(new int[]{first, arr[i]});
                }
                len--;
                j++;

            }
            first = arr[i];
        }
        return list.size();
        */


        int count=0;
        ArrayList<Integer> list=new ArrayList();
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            } else {
                list.add(count);
                count=0;
            }
        }
        list.add(count);
        return Collections.max(list);
    }

    public static void main(String[] args){
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}
