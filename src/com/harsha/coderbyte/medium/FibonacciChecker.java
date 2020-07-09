package com.harsha.coderbyte.medium;

import java.util.Scanner;

/**
 * Have the function FibonacciChecker(num) return the string yes if the number given is part of the Fibonacci sequence.
 * This sequence is defined by: Fn = Fn-1 + Fn-2, which means to find Fn you add the previous two numbers up.
 *
 * The first two numbers are 0 and 1, then comes 1, 2, 3, 5 etc. If num is not in the Fibonacci sequence,
 * return the string no.
 *
 * Fibonacci Series :: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
 *
 */
public class FibonacciChecker {

    static boolean fibonacciChecker(int num){
        int fib1 = 0;
        int fib2 = 1;

        while (fib2 < num) {
            int temp = fib1;
            fib1 = fib2;
            fib2 += temp;
        }
        return (fib2 == num);
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print(fibonacciChecker(54));
        System.out.print(fibonacciChecker(55));
    }

}
