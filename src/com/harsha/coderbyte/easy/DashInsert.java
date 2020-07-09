package com.harsha.coderbyte.easy;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Have the function DashInsert(str) insert dashes ('-') between each two odd numbers in str.
 * For example: if str is 454793 the output should be 4547-9-3. Don't count zero as an odd number.
 *
 *
 */
public class DashInsert {

    public static String dashInsert(String str) {

        char[] nums = str.toCharArray();
        int prevNum = Integer.parseInt(String.valueOf(nums[0]));
        StringBuilder result = new StringBuilder(String.valueOf(prevNum));
        int num =0;
        for(char n: nums){
           num = Integer.parseInt(String.valueOf(n));
           if (num != 0 && prevNum % 2 == 1 && num % 2 == 1) {
              result.append("-");
           }
           result.append(num);
           prevNum = num;
        }

        return result.toString();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(dashInsert(s.nextLine()));
    }
}
