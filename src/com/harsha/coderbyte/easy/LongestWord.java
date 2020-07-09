package com.harsha.coderbyte.easy;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static java.util.Arrays.stream;

/**
 *  * Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string.
 *  * If there are two or more words that are the same length, return the first word from the string with that length.
 *  * Ignore punctuation and assume sen will not be empty.
 */
//Input: "fun&!! time"
//Output: time
//
//Input: "I love dogs"
//Output: love

public class LongestWord {
    public static String LongestWord(String sen) {
        // old code
//        String[] words = sen.split("[^A-Za-z0-9]");
//        for(String word: words){
//            if(word.length() > len.get())
//            s.set(word);
//            len.set(word.length());
//        }

        AtomicInteger len = new AtomicInteger();
        AtomicReference<String> s= new AtomicReference<String>();
        stream(sen.split("[^A-Za-z0-9]"))
                .filter(word -> word.length() > len.get())
                .forEach(word -> {
                    s.set(word);
                    len.set(word.length());
                });

        return s.get();
    }

    public static void main (String[] args) {
        // keep this function call here
        System.out.println(LongestWord("fun&!! time"));
        System.out.println(LongestWord("I love dogs"));
    }

}