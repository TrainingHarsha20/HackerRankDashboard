package com.harsha.coderbyte.easy;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it
 * (ie. if num = 4, return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 18.
 *
 */
public class FirstFactorial {
    public static int factorial(int num) {
        AtomicInteger sum = new AtomicInteger(1);
        IntStream.iterate(num,i -> i-1).limit(num).forEach(i -> sum.set(sum.get()*i));
        return sum.get();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(factorial(5));
        System.out.println(factorial(4));
        System.out.println(factorial(10));
    }
}
