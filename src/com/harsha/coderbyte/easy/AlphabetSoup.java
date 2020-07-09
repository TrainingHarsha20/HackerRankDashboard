package com.harsha.coderbyte.easy;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Have the function AlphabetSoup(str) or letter change take the str string parameter being passed
 * and return the string with the letters in alphabetical order (ie. hello becomes ehllo).
 *
 * Assume numbers and punctuation symbols will not be included in the string.
 *
 */
public class AlphabetSoup {

    public static String AlphabetSoup(String str) {
        //Using java 8
        return Stream.of(str.split("")).sorted().collect(Collectors.joining());
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(AlphabetSoup("hello"));
    }
}
