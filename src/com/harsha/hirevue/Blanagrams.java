package com.harsha.hirevue;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Blanagrams {

    private static boolean checkBlanagrams(String word1, String word2) {
        String s1 = word1.replaceAll("\\s", "");
        String s2 = word2.replaceAll("\\s", "");
//        boolean status = false;
//        if(s1.length() == s2.length()){
//            char[] a1 = s1.toCharArray();
//            char[] a2 = s2.toCharArray();
//            status = Arrays.equals(a1, a2);
//        } else {
//            if(s1.length() - s2.length() == 1) status = true;
//        }
//        return status;

            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();

        if (a1.length != a2.length)
            return false;
        int[] counts = new int[26]; // An array to hold the number of occurrences of each character
        for (int i = 0; i < a1.length; i++){
            // convert the char into an array index
            counts[a1[i]-97]++;  // Increment the count of the character at i
            counts[a2[i]-97]--;  // Decrement the count of the character at i
        }
        // If the strings are anagrams, the counts array will be full of zeros
        for (int i = 0; i<26; i++)
            if (counts[i] != 0)
                return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(checkBlanagrams("tangram","angramt"));
        System.out.println("second Check : " + checkBlanagrams("tangram","angram"));
    }
}