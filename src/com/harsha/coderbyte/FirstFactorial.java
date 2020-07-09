package com.harsha.coderbyte;

import java.util.Scanner;

public class FirstFactorial {

    public static int FirstFactorial(int num) {
        // code goes here
        int num1 =0;
        for (int i=num; i>0; i--){
            num1 = num1*i;
        }
        return num1;
    }

    public static void main (String[] args) {
        // keep this function call here
//        Scanner s = new Scanner(System.in);
        int a = 8;
        System.out.print(FirstFactorial(a));
    }

}