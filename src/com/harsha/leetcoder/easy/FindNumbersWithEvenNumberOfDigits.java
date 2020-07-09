package com.harsha.leetcoder.easy;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 *
 * Example 1:
 *
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 * Example 2:
 *
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 */
public class FindNumbersWithEvenNumberOfDigits {

    //Using Strings
    public static int findNumbersWithEvenNumberOfDigits1(int[] num){
        int count = 0;
        int res = 0;
        for(int i = 0; i<num.length; i++) {
            int n = num[i];
            res += String.valueOf(n).length()%2 == 0 ? 1 : 0;
        }
        return res;
    }

    public static int findNumbersWithEvenNumberOfDigits(int[] num){
        int res = 0;
        for(int i = 0; i<num.length; i++) {
            int n = num[i];
            int count = 0;
            while(n != 0)
            {
                n /= 10;
                ++count;
            }

            if(count%2 == 0){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args){
//        System.out.println(" Number of even digits : " + findNumbersWithEvenNumberOfDigits(new int[]{12, 345,2,6,7896}));
        System.out.println(" Number of even digits : " + findNumbersWithEvenNumberOfDigits(new int[]{12,345,2,6,7896}));
        System.out.println(" Number of even digits : " +findNumbersWithEvenNumberOfDigits(new int[]{555,901,482,1771}));
    }
}
