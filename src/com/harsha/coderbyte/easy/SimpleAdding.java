package com.harsha.coderbyte.easy;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Have the function SimpleAdding(num) add up all the numbers from 1 to num.
 * For the test cases, the parameter num will be any number from 1 to 1000.
 *
 */
public class SimpleAdding {

    static int adding(int num){
        return IntStream.range(0,num+1).sum();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(adding(s.nextInt()));
    }
}
