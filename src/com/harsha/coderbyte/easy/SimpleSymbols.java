package com.harsha.coderbyte.easy;

import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.StreamSupport.stream;

/**
 * Have the function SimpleSymbols(str) take the str parameter being passed and
 * determine if it is an acceptable sequence by either returning the string true or false.
 *
 * The str parameter will be composed of + and = symbols with several letters between them (ie. ++d+===+c++==a)
 * and for the string to be true each letter must be surrounded by a + symbol.
 * So the string to the left would be false.
 * The string will not be empty and will have at least one letter.
 *
 */
public class SimpleSymbols {
    static String adding(String str){
        String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        String ALPHABET_UPPER = ALPHABET.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (ALPHABET.indexOf(c) > -1 || ALPHABET_UPPER.indexOf(c) > -1) {
                if (i == 0 || i == str.length() - 1) {
                    return "false";
                }

                char cp = str.charAt(i - 1);
                char cn = str.charAt(i + 1);

                if (cp != '+' || cn != '+') {
                    return "false";
                }
            }
        }
        return "true";

//        String symbols = "+=";
//        char[] charArray = str.toCharArray();
//        for(int i=1;i<charArray.length-1;i++){
//            charArray[i]
//        }
//        return false;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(adding(s.nextLine()));
    }
}
