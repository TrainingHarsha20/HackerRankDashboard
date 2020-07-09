package com.harsha.coderbyte.medium;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Have the function MultipleBrackets(str) take the str parameter being passed and
 * return 1 #ofBrackets if the brackets are correctly matched and each one is accounted for. Otherwise return 0.
 *
 * For example: if str is "(hello [world])(!)", then the output should be 1 3
 * because all the brackets are matched and there are 3 pairs of brackets,
 * but if str is "((hello [world])" the the output should be 0 because the brackets do not correctly match up.
 * Only "(", ")", "[", and "]" will be used as brackets. If str contains no brackets return 1.
 */
public class MultipleBrackets {

    static String getMultipleBrackets(String str){

        int openSquareBrackets = 0, openBrackets = 0 , nrOfBrackets =0;
        for(char c : str.toCharArray()){
//            System.out.println( " c ::" + c);
            if (c == '(') {
                openBrackets++;
                nrOfBrackets++;
            } else if (c == '[') {
                openSquareBrackets++;
                nrOfBrackets++;
            } else if (c == ')' && openBrackets > 0) {
                openBrackets--;
            } else if (c == ']' && openSquareBrackets > 0) {
                openSquareBrackets--;
            } else if (c == ')' || c == ']') {
                return "0";
            }
        }
        return openBrackets == 0 && openSquareBrackets == 0 ? "1 " + nrOfBrackets : "0";
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(getMultipleBrackets("((hello) [world])"));
//        System.out.print(arithGeoTwo(new int[]{2, 6, 18, 54}));
    }
}
