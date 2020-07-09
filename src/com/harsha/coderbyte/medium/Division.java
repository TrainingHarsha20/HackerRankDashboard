package com.harsha.coderbyte.medium;

import java.util.Scanner;

/**
 * Have the function Division(num1,num2) take both parameters being passed and return the Greatest Common Factor.
 *
 * That is, return the greatest number that evenly goes into both numbers with no remainder.
 * For example: 12 and 16 both are divisible by 1, 2, and 4 so the output should be 4.
 * The range for both parameters will be from 1 to 10^3.
 *
 */
public class Division {

    static int div(int n1, int n2){
        if (n1 == n2) return n1;
        if (n2 % n1 == 0) return n1;
        if (n1 % n2 == 0) return n2;
//        int biggest = n1 > n2 ? n1 : n2;
        int smallest = n1 < n2 ? n1 : n2;

        for (int i = smallest - 1; i >= 1; i--) {
//            System.out.println("smallest ::" + smallest + " biggest:: "+  biggest + " :: "+ i );
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(div(12,16));
    }

}
