package com.harsha.coderbyte;

import java.util.Scanner;

public class BinaryReversal {
    public static String BinaryReversal(String str) {
        int strInt = Integer.parseInt(str);
        String bInt = Integer.toBinaryString(strInt);
        StringBuilder sb = new StringBuilder(bInt).reverse();
        String reversedBinaryNum = sb.toString();
        reversedBinaryNum += (reversedBinaryNum.length() % 8 > 0 ? "0000000".substring(0, 8 - reversedBinaryNum.length() % 8) : "");
        int newInt = Integer.parseInt(reversedBinaryNum, 2);
        return Integer.toString(newInt);
    }

    public static void main (String[] args) {
        // keep this function call here
        //Input 213
        //output 171
        Scanner s = new Scanner(System.in);
        System.out.print(BinaryReversal(s.nextLine()));
    }
}