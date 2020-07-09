package com.harsha.coderbyte.easy;

import java.util.Scanner;

/**
 * Have the function ABCheck(str) take the str parameter being passed and return the string true if the
 * characters a and b are separated by exactly 3 places anywhere in the string at least once
 * (ie. "lane borrowed" would result in true because there is exactly three characters between a and b).
 * Otherwise return the string false.
 *
 */

public class ABCheck {
    public static boolean abChecker(String str) {
        int aIndex = str.indexOf('a');
        int bIndex = str.indexOf('b');
        //after 3 char. So 4 th char should be b
        if(bIndex == (aIndex+4)) return true;
        return false;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(abChecker(s.nextLine()));
    }
}
