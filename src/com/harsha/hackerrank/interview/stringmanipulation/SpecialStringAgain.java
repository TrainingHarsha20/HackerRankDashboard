package com.harsha.hackerrank.interview.stringmanipulation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SpecialStringAgain {
    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
/*
        int mid = s.length() >> 1;
        for(int i= 1; i< s.length() -1; i++){
            if(i+1 <= s.length()){
                if(s.charAt(i) == s.charAt(i+1) ) {
                    System.out.println( s.charAt(i) +""+ s.charAt(i+1)  );
                } else if (s.charAt(i+1) == s.charAt(i-1)){
                    System.out.println(s.charAt(i-1) +""+ s.charAt(i) +""+ s.charAt(i + 1));
                }
            }
        }
        return 0;
*/
        int ans = s.length();
        for(int i =0; i< ans-1; i++){
            int repeat =0;
            while(i+1< s.length() && s.charAt(i) == s.charAt(i+1)){
                repeat++;
                i++;
            }
            ans+=(repeat*(repeat+1))/2;

            int pointer = 1;
            while(i-pointer>=0
                    && i+pointer<s.length()
                    && s.charAt(i+pointer) == s.charAt(i-1)
                    && s.charAt(i-pointer) == s.charAt(i-1)){
                ans++;
                pointer++;
            }
        }
        System.out.println( ans);
        return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

