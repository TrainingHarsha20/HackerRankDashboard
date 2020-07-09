package com.harsha.coderbyte.medium;

import java.util.Scanner;

/**
 * Have the function ArithGeoII(arr) take the array of numbers stored in arr and
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
public class ArithGeoTwo {

    public static String arithGeoTwo(int[] arr) {
        int diff1 = arr[1] - arr[0] ;
        int diff = arr[1] /arr[0] ;
        String type = null;
        for(int i =1; i<arr.length; i++){
            int arDiff = arr[i] - arr[i-1];
            int geoDiff = arr[i] / arr[i-1];
            if(diff == geoDiff){
                type = "geometric";
            }else if(diff1 == arDiff){
                type = "arithmetic";
            }
        }
        return type != null ? type : "-1";
//        return getArithmetic(arr) ? "arithmetic" : getGeometric(arr) ? "geometric" : "-1";

    }
    /*
    private static boolean getArithmetic(int[] arr) {
        int counter = 0;
        int diff = arr[1] - arr[0];
        for(int i=arr.length;i> 1; i--){
            if(i< arr.length && diff == (arr[i] - arr[i-1])){
                counter++;
            }
        }
        return (counter >0) ? true : false;
    }

    private static boolean getGeometric(int[] arr) {
        int counter = 0;
        int diff = arr[1] / arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(i< arr.length && diff == (arr[i+1] / arr[i])){
                counter++;
            }
        }
        return (counter >0) ?  true : false;
    }*/

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(arithGeoTwo(new int[]{2, 4, 6, 8}));
//        System.out.print(arithGeoTwo(new int[]{2, 6, 18, 54}));
    }

}
