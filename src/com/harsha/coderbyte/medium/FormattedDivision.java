package com.harsha.coderbyte.medium;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Have the function FormattedDivision(num1,num2) take both parameters being passed,
 * divide num1 by num2, and return the result as a string with properly formatted commas
 * and 4 significant digits after the decimal place.
 *
 * For example: if num1 is 123456789 and num2 is 10000 the output should be "12,345.6789".
 * The output must contain a number in the one's place even if it is a zero.
 *
 */
public class FormattedDivision {

    static String formattedDiv(int num1, int num2){
        return new DecimalFormat("#,###,##0.0000").format((double) num1 / num2);
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(formattedDiv(123456789, 10000));
        System.out.println(formattedDiv(123456789, 100));
    }
}
