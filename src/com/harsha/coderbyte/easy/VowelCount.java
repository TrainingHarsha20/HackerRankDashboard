package com.harsha.coderbyte.easy;

import java.util.Scanner;

/**
 * Have the function VowelCount(str) take the str string parameter being passed and
 * return the number of vowels the string contains (ie. "All cows eat grass" would return 5).
 * Do not count y as a vowel for this challenge.
 */

public class VowelCount {
    static int vCount(String str) {
        String vowels= "aeiou";
        String vowels_upper = vowels.toUpperCase();
        int count= 0;
        for(char c: str.toCharArray()){
            if(vowels.indexOf(c) > -1 || vowels_upper.indexOf(c) > -1){
                count++;
            }
        }
        return count;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(vCount(s.nextLine()));
    }
}
