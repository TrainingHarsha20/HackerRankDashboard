package com.harsha.coderbyte.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Have the function LetterCountI(str) take the str parameter being passed and
 * return the first word with the greatest number of repeated letters.
 *
 * For example: "Today, is the greatest day ever!" should return greatest
 * because it has 2 e's (and 2 t's) and it comes before ever which also has 2 e's.
 * If there are no words with repeating letters return -1.
 *
 * Words will be separated by spaces.
 *
 */
public class LetterCountOne {

    public static String countLetters(String str) {
        String winningWord = null;
        int highestCharCount = 0;
        for(String word : str.split(" ")){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            char previousChar = chars[0];
            int charCount = 0;
            for(char c : chars){
                if(c == previousChar){
                    charCount++;
                }
                else {
                    if (charCount > highestCharCount) {
                        highestCharCount = charCount;
                        winningWord = word;
                    }
                    charCount = 1;
                    previousChar = c;
                }
            }
        }
        return winningWord;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(countLetters(s.nextLine()));
    }
}