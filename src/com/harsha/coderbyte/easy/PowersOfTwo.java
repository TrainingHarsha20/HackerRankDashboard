package com.harsha.coderbyte.easy;

import java.util.Scanner;

/**
 * Have the function PowersofTwo(num) take the num parameter being passed which will be an integer and
 * return the string true if it's a power of two.
 * If it's not return the string false.
 *
 * For example if the input is 16 then your program should return the string true
 * but if the input is 22 then the output should be the string false.
 *
 */
public class PowersOfTwo {

    private static boolean powersOfTwo(int input) {
//        return (input & (input - 1)) == 0;
        if(input==0) return false;
        double first = Math.log(input);
        double sec = Math.log(2);
        System.out.println( "first : " + first + " :: "+ sec);
        long act = Math.round(first / sec);
        System.out.println( "act :: " + act);
        double t = Math.pow(2, act);
        System.out.println("t :" + t);
        return input == t;
//        return input == Math.pow(3, Math.round(Math.log(input)/Math.log(3)));
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(powersOfTwo(s.nextInt()));
    }
}
