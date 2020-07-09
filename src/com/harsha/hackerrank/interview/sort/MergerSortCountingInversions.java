package com.harsha.hackerrank.interview.sort;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MergerSortCountingInversions {
    // Complete the countInversions function below.
    public static long countInversions(int[] a){
        int n = a.length;
        // Base Case
        if(n <= 1) return 0;

        // Recursive Case
        int mid = n >> 1;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);
        long inversions = countInversions(left) + countInversions(right);

        int range = n - mid;
        int iLeft = 0, iRight = 0;
        for(int i = 0; i < n; i++) {
            if( iLeft < mid
                && ( iRight >= range || left[iLeft] <= right[iRight])
            ) {
                a[i] = left[iLeft++];
                inversions += iRight;
            }
            else if(iRight < range) {
                a[i] = right[iRight++];
            }
        }

        return inversions;
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++){
            int n = scanner.nextInt();
            int[] a = new int[n];

            for(int j = 0; j < n; j++){
                a[j] = scanner.nextInt();
            }

            System.out.println(countInversions(a));
        }

        scanner.close();
    }
}