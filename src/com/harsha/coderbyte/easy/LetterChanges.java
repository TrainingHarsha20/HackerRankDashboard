package com.harsha.coderbyte.easy;

import java.awt.*;
import java.util.Scanner;

/**
 * Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm.
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
 *
 */
public class LetterChanges {

    public static String lchange(String str) {
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        final String ALPHABET_UPPER = ALPHABET.toUpperCase();
        final String VOWELS = "aeiou";
        StringBuilder newStr = new StringBuilder();

        for (char c : str.toCharArray()) {
            int index = ALPHABET.indexOf(c);
            if (index > -1) {
                char newChar = index < ALPHABET.length() - 1 ? ALPHABET.charAt(index + 1) : 'a';
                if (VOWELS.indexOf(newChar) > -1) {
                    newChar = Character.toUpperCase(newChar);
                }
                newStr.append(newChar);
            } else {
                index = ALPHABET_UPPER.indexOf(c);
                if (index > -1) {
                    char newChar = index < ALPHABET_UPPER.length() - 1 ? ALPHABET_UPPER.charAt(index + 1) : 'A';
                    newStr.append(newChar);
                } else {
                    newStr.append(c);
                }
            }
        }
        return newStr.toString();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(lchange(s.nextLine()));
    }
}
