package com.harsha.anyinterview.mathematical;

import java.util.Scanner;

/**
 * Given the first 2 terms A and B of an Arithmetic Series, tell the Nth term of the series.
 *
 * Input:
 * The first line of input contains an integer, the number of test cases T. T testcases follow. Each testcase in its first line should contain two positive integer A and B(First 2 terms of AP). In the second line of every testcase it contains of an integer N.
 *
 * Output:
 * For each testcase, in a new line, print the Nth term of the Arithmetic Progression.
 *
 * Constraints:
 * 1 <= T <= 100
 * -103 <= A <= 103
 * -103 <= B <= 103
 * 1 <= N <= 104
 *
 * Example:
 * Input:
 * 2
 * 2 3
 * 4
 * 1 2
 * 10
 *
 * Output:
 * 5
 * 10
 */
public class SeriesAP {
//    Sum of first n terms of an AP: S =(n/2)[2a + (n- 1)d]
    //Arithmetic
    static int seriesOfAp(int[] arr ){
        if(arr.length == 0) return 0;
        if(arr.length == 1) return arr[1];
        int diff = arr[1] -arr[0];
        for(int i=1; i< arr.length-1; i++){
            if(diff == arr[i + 1] - arr[i]) return diff;
        }
        return diff;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(seriesOfAp(new int[]{2,4,6,8,10}));
    }

}
