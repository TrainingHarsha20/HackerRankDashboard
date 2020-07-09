package com.harsha.coderbyte.easy;

import java.util.Scanner;

/**
 * Have the function Palindrome(str) take the str parameter being passed and
 * return the string true if the parameter is a palindrome, (the string is the same forward as it is backward)
 * otherwise return the string false.
 *
 * For example: "racecar" is also "racecar" backwards. Punctuation and numbers will not be part of the string.
 *
 */
public class Palindrome {

    private static boolean findPalindrome(String input) {

//        return new StringBuilder(input).reverse().toString().equals(input) ? true : false;
        String[] sArray = input.split(" ");
        boolean isPalindrome = false;
        String wordPalindrome = null;
        for(String newStr : sArray){
            int i = 0;
            for(char c : newStr.toCharArray()){
                if(c == newStr.charAt(newStr.length()-1-i)){
                    isPalindrome = true;
                }else{
                    isPalindrome = false;
                }
            }
            if(isPalindrome) {
                wordPalindrome = newStr;
                System.out.println( wordPalindrome);
            }
        }
        return isPalindrome;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(findPalindrome(s.nextLine()));
    }

}
