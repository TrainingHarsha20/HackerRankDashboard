package com.harsha.coderbyte;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements:
 * the first element will represent a list of comma-separated numbers sorted in ascending order, the second element will
 * represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated string
 * containing the numbers that occur in elements of strArr in sorted order. If there is no intersection,
 * return the string false.
 *
 * For example: if strArr contains ["1, 3, 4, 7, 13", "1, 2, 4, 13, 15"] the output should return "1,4,13"
 * because those numbers appear in both strings. The array given will not be empty, and each string inside the array
 * will be of numbers sorted in ascending order and may contain negative numbers.
 *
 */
public class FindIntersection {
    public static String FindIntersection(String[] strArr) {
        StringTokenizer st = new StringTokenizer(strArr[0]);
        StringBuilder ans = new StringBuilder();
        while (st.hasMoreTokens()){
            String s1 = st.nextToken();
            if(strArr[1].indexOf(s1) > 0) ans.append(s1);
        }

        if (ans.toString().length() == 0)
            strArr[0] = "false";
        else {
            String anser = ans.toString().substring(0, ans.toString().length());
            strArr[0] = anser;
        }
        return strArr[0];
    }

    public static void main(String[] args) {
        // keep this function call here
        System.out.println(FindIntersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));
        System.out.println(FindIntersection(new String[] {"1, 3", "9, 2"}));
    }

}