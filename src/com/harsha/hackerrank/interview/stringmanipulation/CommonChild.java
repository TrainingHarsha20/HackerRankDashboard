package com.harsha.hackerrank.interview.stringmanipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CommonChild {
    // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {
        int count = 0;
        count = LCSM4(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
//        String st1, st2;
//        for(int i =0; i< s1.length(); i++){
//            char c = s1.charAt(i);
////            int s2Index = s2.indexOf(c);
//            int s2Index = s2.indexOf(c,i);
////            st1 = c
//            if(s2Index >= 0 && (i == s2Index || i <= s2Index)){
//                count++;
//            }
//        }
        System.out.println(count);
     return count;
    }

    static int LCSM4(char[] x, char[] y, int m, int n){
        int ip[] = new int[n+1];
        for(int i= 1; i<= m; i++){
            int prev = 0;
            for(int j= 1; j<= n; j++){
                int temp = ip[j];
                if(x[i-1] == y[j-1]) {
                    ip[j] = prev+1;
                }else {
                    ip[j] = Math.max(ip[j], ip[j-1]);
                }
                prev = temp;
            }
        }
        return ip[n];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = commonChild(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
