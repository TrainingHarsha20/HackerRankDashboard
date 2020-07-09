package com.harsha.coderbyte.easy;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter
 * of each word. Words will be separated by only one space.
 *
 */
public class LetterCapitalize {
    public static String lCapitalize(String str) {
        String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length; i++){
            sb.append(s[i].replaceFirst("[a-z]",s[i].substring(0,1).toUpperCase()));
            if(i != 0 || i != s.length){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(lCapitalize(s.nextLine()));
    }
}
