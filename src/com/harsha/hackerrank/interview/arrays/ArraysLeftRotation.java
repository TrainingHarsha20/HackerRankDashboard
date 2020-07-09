package com.harsha.hackerrank.interview.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArraysLeftRotation {
    static int[] rotLeft(int[] a, int d) {
        /*
        //Way 1
        int size = a.length;
        int i =0, rotate_index=d;

        int[] b= new int[size];

        while(rotate_index<size){
            b[i]= a[rotate_index];
            i++;
            rotate_index++;
        }
        rotate_index=0;

        while(rotate_index<d){
            b[i]= a[rotate_index];
            i++;
            rotate_index++;
        }
        Arrays.stream(b).forEach(System.out::println);
        return b;
*/
        //way2
        int[] newA = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            newA[i] = a[(i + d) % a.length];
        }
        Arrays.stream(newA).forEach(System.out::println);
        return newA;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
