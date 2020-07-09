package com.harsha.hackerrank.interview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Sample Input 0
//aba
//10

//Sample Input 1
//a
//1000000000000

public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long whole = n / s.length();
        int reminder = (int)(n % s.length());
        long found=0;
        for(char c : s.toCharArray()){
            if(c == 'a')found++;
        }
        long total = found*whole;
        if(reminder == 0) {
            System.out.println(total);
        }else {
            String part = s.substring(0, reminder);
            for(char c : part.toCharArray()){
                if(c== 'a'){
                    total++;
                }
            }
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(String.valueOf(result));
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
        scanner.close();
    }
}
