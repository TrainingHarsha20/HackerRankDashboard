package com.harsha.coderbyte.easy;

import java.util.Scanner;

/**
 * Have the function ArithGeo(arr) take the array of numbers stored in arr and
 * return the string "Arithmetic" if the sequence follows an arithmetic pattern or
 * return "Geometric" if it follows a geometric pattern.
 * If the sequence doesn't follow either pattern return -1.
 *
 * An arithmetic sequence is one where the difference between each of the numbers is consistent,
 * where as in a geometric sequence, each term after the first is multiplied by some constant or common ratio.
 *
 * Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54].
 * Negative numbers may be entered as parameters, 0 will not be entered, and no array will contain all the same elements
 *
 */
public class ArithGeo {
    public static String arithGeo(int[] arr) {
        boolean isArth = false;
        if(arr.length <2) return "-1";

        if(isArthematic(arr, isArth)){
            return "Arithmetic";
        } else if (isGeometric(arr, isArth)) {
            return "Geometric";
        }
        return "-1";
    }

    private static boolean isGeometric(int[] arr, boolean isValid) {
        int diff = arr[1] /arr[0];
        for(int i=1; i< arr.length-1; i++){
            int newDiff = arr[i + 1] / arr[i];
            isValid = checkType(diff, newDiff);
        }
        return isValid;
    }

    private static boolean checkType(int diff, int newDiff) {
        boolean isValid;
        if(diff == newDiff){
            isValid = true;
        }else {
            isValid = false;
        }
        return isValid;
    }

    private static boolean isArthematic(int[] arr, boolean isValid) {
        int diff = arr[1] -arr[0];
        for(int i=1; i< arr.length-1; i++){
            int newDiff = arr[i + 1] - arr[i];
            isValid = checkType(diff, newDiff);
        }
        return isValid;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int[] input =  {2, 4, 6, 8};
//        int[] input =  {2, 6, 18, 54};
//        int[] input =  {2, 6, 18, 52};
        System.out.println(arithGeo(input));
    }
}
