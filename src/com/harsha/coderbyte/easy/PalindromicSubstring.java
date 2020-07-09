package com.harsha.coderbyte.easy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalindromicSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scanner.nextLine();

//        System.out.println(printAllPalindromes(str));
        System.out.println(longestPalSubstr(str));
        boolean flag = true;
        if (flag) {
            System.out.println("Palindrome String : " + str);
        } else {
            System.out.println("Not a palindorme strimg : " + str);
        }
    }
//    Input: "hellosannasmith"
//    Output: sannas

//    Input: "abcdefgg"
//    Output: none
//
static String longestPalSubstr(String str) {
    int maxLength = 1; // The result (length of LPS)

    int start = 0;
    int len = str.length();
    int low, high;

    // One by one consider every character as center
    // point of even and length palindromes
    for (int i = 1; i < len; ++i)
    {
        // Find the longest even length palindrome with
        // center points as i-1 and i.
        low = i - 1;
        high = i;
        while (low >= 0 && high < len
                && str.charAt(low) == str.charAt(high)) {
            if (high - low + 1 > maxLength) {
                start = low;
                maxLength = high - low + 1;
            }
            --low;
            ++high;
        }

        // Find the longest odd length palindrome with
        // center point as i
        low = i - 1;
        high = i + 1;
        while (low >= 0 && high < len
                && str.charAt(low) == str.charAt(high)) {
            if (high - low + 1 > maxLength) {
                start = low;
                maxLength = high - low + 1;
            }
            --low;
            ++high;
        }
    }

    String palindrom = str.substring(start, start + maxLength );
    if(palindrom.length()<3){
        palindrom = "none";
    }
    return palindrom;
}



    public static Set<CharSequence> printAllPalindromes(String input) {
    if (input.length() <= 2) {
        return Collections.emptySet();
    }
    Set<CharSequence> out = new HashSet<CharSequence>();
    int length = input.length();
    for (int i = 1; i <= length; i++) {
        for (int j = i - 1, k = i; j >= 0 && k < length; j--, k++) {
            if (input.charAt(j) == input.charAt(k)) {
                out.add(input.subSequence(j, k + 1));
            } else {
                break;
            }
        }
    }
    return out;
}
/*
    private static StringBuilder isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            System.out.println(str.charAt(i) +" :: "+ str.charAt(j));
            if (str.charAt(i) != str.charAt(j)) {
//                return false;
            } else {
                sb.append(str.charAt(i)).append(str.charAt(j));
//                return true;
            }
        }
        return sb;
    }*/
}