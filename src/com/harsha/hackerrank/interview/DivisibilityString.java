package com.harsha.hackerrank.interview;

import com.harsha.hackerrank.interview.stringmanipulation.AccessModiferTest;

public class DivisibilityString {

    static int divisibilityString(String s, String t){

        if(s==null || t== null || s.length() < t.length()) return -1;
        //create new string by removing t from s using substring method
        String s1 = s.substring(0, t.length());
        //if mod is 0 then string s is concatenated n times of string t
        int modLen = s.length() % s1.length();
        //make sure t and s1 matches and modlength is 0
        //finding repeated substring inside a string
//        int rStringLen = (t + t).indexOf(t, 1);
        String newStr = t + t;
        System.out.println(newStr + " :: Before Len -> "+t.length()+ " :: After Len -> "+newStr.length());
        int rStringLen = newStr.indexOf(t, 1);
//        int rStringLen = t.indexOf(t, 0);

        return (t.equalsIgnoreCase(s1) && modLen  == 0) ? t.substring(0,rStringLen).length() : -1;
    }


    public static void main(String[] args) {
        //Input 0
        String s = "bcdbcdbcdbcd";
        String t = "bcdbcd";

        //Input1
//        String s = "bcdbcdbcd";
//        String t = "bcdbcd";

        //input2
//        String s = "lrbb";
//        String t = "lrbb";

        //input3
//        String s = "rbrb";
//        String t = "rbrb";

        long result = divisibilityString(s, t);
        System.out.println(String.valueOf(result));
    }
}
