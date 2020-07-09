package com.harsha.hackerrank.interview.sort;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MergerSortCountingInversions2 {
    // Complete the countInversions function below.
    public static long countInversions(int[] a){
       return mergeSort(a, new int[a.length],0, a.length-1);
    }

    static long mergeSort(int[] a,int[] temp, int leftStart, int rightEnd){

        if(leftStart >= rightEnd) return 0;
        int mid = (leftStart + rightEnd) / 2;
        mergeSort(a,temp,leftStart,mid);
        mergeSort(a,temp,mid+1,rightEnd);
//        rightEnd = a.length;
        int fc = mergeCombine(a, temp, leftStart, rightEnd);
       return fc;
    }

    static int mergeCombine(int[] a,int[] temp, int leftStart, int rightEnd){
        int leftEnd = ( rightEnd + leftStart ) / 2;
        int rightStart = leftEnd+1;
        int size = rightEnd - leftStart +1;
        int left = leftStart, right = rightStart, index = leftStart;
        while(left <= leftEnd && right <= size){
            if(a[left] <= a[right]){
                temp[index] = a[left];
                left++;
            }else{
                temp[index] = a[right];
                right++;
            }
            index++;
        }

        System.arraycopy(a, left ,temp, index, leftEnd - left +1);
        System.arraycopy(a, right ,temp, index, rightEnd - right);
        System.arraycopy(temp, leftStart, a, leftStart ,size);
        return 0;
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