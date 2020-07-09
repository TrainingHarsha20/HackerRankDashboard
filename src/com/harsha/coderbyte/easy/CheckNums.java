package com.harsha.coderbyte.easy;

import java.util.Scanner;

/**
 * Have the function CheckNums(num1,num2) take both parameters being passed and return the string true if num2 is
 * greater than num1, otherwise return the string false.
 * If the parameter values are equal to each other then return the string -1.
 *
 */

public class CheckNums {
    static String checkNums(int num1, int num2) {
        return (num1<num2)? "true" : (num1>num2) ? "false" : "-1";
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = 2, num2 =3;
//        int num1 = 5, num2 =3;
//        int num1 = 10, num2 =10;
        System.out.println(checkNums(num1, num2));
    }
}
