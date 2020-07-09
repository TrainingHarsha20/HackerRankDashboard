package com.harsha.leetcoder.easy;

import java.io.IOException;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    //below code will fail if there are any negative numbers
    public int reverse1(int x) {
        StringBuffer sb = new StringBuffer(String.valueOf(x));
//        sb.reverse().toString();
        return Integer.parseInt(sb.reverse().toString());
    }

    public static void main(String[] args) throws IOException {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(123));
    }
}
