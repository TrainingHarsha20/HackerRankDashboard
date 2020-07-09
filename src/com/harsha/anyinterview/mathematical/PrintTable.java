package com.harsha.anyinterview.mathematical;

import java.util.Scanner;

/**
 * Print the table of a given number N.
 *
 * Input:
 * First line contains an integer, the number of test cases 'T'. T testcases follow. Each testcase cotains one line of input denoting N.
 *
 * Output:
 * For each testcase, print the table of N upto 10.
 *
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 1000
 *
 * Example:
 * Input:
 * 1
 * 9
 *
 * Output:
 * 9 18 27 36 45 54 63 72 81 90
 */
public class PrintTable {
    static String printTable(int num){
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=num+1;i++){
            sb.append(num*i).append(" ");
        }
        return sb.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(printTable(s.nextInt()));
    }
}
