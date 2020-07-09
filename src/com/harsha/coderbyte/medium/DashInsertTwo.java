package com.harsha.coderbyte.medium;

import java.util.Scanner;

/**
 * Have the function DashInsertII(str) insert dashes ('-') between each two odd numbers and insert asterisks ('*')
 * between each two even numbers in str.
 *
 * For example: if str is 4546793 the output should be 454*67-9-3.
 * Don't count zero as an odd or even number.
 *
 */
public class DashInsertTwo {

    static String dashInsert2(String str){
        String[] strArr = str.split("");
        StringBuilder sb = new StringBuilder(strArr[0]);
        for(int i =1; i<strArr.length; i++){
            if(isEvenNum(strArr[i]) && isEvenNum(strArr[i-1])){
                System.out.println(strArr[i] + " :: " + strArr[i-1]);
                sb.append("*").append(strArr[i]);
            }else if(!isEvenNum(strArr[i]) && !isEvenNum(strArr[i-1])){
                sb.append("-").append(strArr[i]);
            }else{
                sb.append(strArr[i]);
            }
        }
        return sb.toString();
    }

    static boolean isEvenNum(String input){
        return Integer.parseInt(input)%2 ==0 ? true : false;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(dashInsert2(s.nextLine()));
    }

}
