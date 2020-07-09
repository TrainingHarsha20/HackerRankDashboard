package com.harsha.k2view;

import java.io.IOException;

public class RemoveSpaceInString {

    static String printString(String s){
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c != ' ') sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String input = "abcddda bc cbbcaaaa cc";
        System.out.println(printString(input));
    }
}
