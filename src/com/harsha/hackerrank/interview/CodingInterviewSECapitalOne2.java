package com.harsha.hackerrank.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Technical: Longest increasing sequence in 2d array
 *
 * You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.
 *
 * Now, we define a pair (c, d) can follow another pair (a, b) if and only if b < c. Chain of pairs can be formed in this fashion.
 *
 * Given a set of pairs, find the length longest chain which can be formed. You needn't use up all the given pairs. You can select pairs in any order.
 *
 * Example 1:
 * Input: [[1,2], [2,3], [3,4]]
 * Output: 2
 * Explanation: The longest chain is [1,2] -> [3,4]
 *
 * Note:
 * The number of given pairs will be in the range [1, 1000].
 */
public class CodingInterviewSECapitalOne2 {

    public static int findLengthOfLCIS(int[][] pairs) {
    /*
        Arrays.sort(pairs, new Comparator<int[]>() {

            public int compare(int[] i1, int[] i2) {
                return ((Integer)i1[0]).compareTo(i2[0]);
            }
        });
*/
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        int[] lis = new int[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1]) {
                    lis[i] = Math.max(lis[i], 1 + lis[j]);
                }
            }
        }
        return lis[lis.length - 1];

    }


    public static void main(String[] args){
//        System.out.println( " Longest Continuous Increasing Subsequence : " + findLengthOfLCIS(new int[][]{1,3,5,4,7}));
        System.out.println( " Longest Continuous Increasing Subsequence : " + findLengthOfLCIS(new int[][]{{1,2}, {2,3}, {3,4}}));
    }
}