package com.harsha.leetcoder.easy;

import java.io.IOException;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string.
 * This is consistent to C's strstr() and Java's indexOf().
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
//        if(haystack == null || needle == null ) return 0;
//        int counter  = 0;
//        for(char c: needle.toCharArray()){
//            return haystack.indexOf(c);
//        }
//        return -1;


        int m=haystack.length();
        int n=needle.length();
        if(n==0){return 0;}
        if(n>m){return -1;}

        for(int i=0;i<m-n+1;i++){
            if(haystack.substring(i,i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        ImplementStrStr ri = new ImplementStrStr();
//        System.out.println( " prefix:: " + ri.strStr("hello","ll"));
        System.out.println( " prefix:: " + ri.strStr("",""));
    }
}
