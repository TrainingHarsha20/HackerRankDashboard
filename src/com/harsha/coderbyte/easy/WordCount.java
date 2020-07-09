package com.harsha.coderbyte.easy;

import java.util.Scanner;

/**
 * Have the function WordCount(str) take the str string parameter being passed and
 * return the number of words the string contains (ie. "Never eat shredded wheat" would return 4).
 *
 * Words will be separated by single spaces.
 */

public class WordCount {
    static int wCount(String str) {
        return str.split("\\s").length;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(wCount(s.nextLine()));
    }

}
