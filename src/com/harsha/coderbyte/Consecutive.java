package com.harsha.coderbyte;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Consecutive {
    public static int Consecutive(int[] arr) {
        // code goes here
//        Input: new int[] {5,10,15}
//        Output: 8
//        Input: new int[] {-2,10,4}
//        Output: 10

        Arrays.sort(arr);
        int min1=0;
        for(int i=1; i< arr.length; i++){
            min1 += Math.abs(arr[i]-arr[i-1])-1;
        }
        return min1;


        /*
        OptionalInt m = IntStream.of(arr).min();
        int min = IntStream.of(arr).min().getAsInt();
        BitSet b = new BitSet();
        for (int i : arr)
            b.set(i - min);
        int i = 0, counter =0;
//        while((i = arr[i+1]) <arr.length){
//            System.out.println(i + min);
//            counter++;
//        }
        while ((i = b.nextClearBit(i + 1)) < b.length()){
            System.out.println( " b.nextClearBit(i + 1) " + b.nextClearBit(i + 1));
            System.out.println(i + min);
            counter++;
        }

    return counter;*/
        /*Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        int minimumVal = 0;

        for(int i = 0; i < (arr.length - 1); i++) {
            int next = arr[i + 1];
            int current = arr[i];
            if((next - current) > 1) {
                System.out.println("Missing Value : " + (current + 1));
            }
        }
        *//*
        for(int i= 0; i<=max; i++){
            System.out.println(i);

            if(arr[i] ){
                minimumVal++;
            }
//            minimumVal +=  (arr[i+1] - arr[i])-1;
//            minimumVal++;
        }*//*

        return minimumVal;*/
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Consecutive(new int[] {-2,10,4}));
//        System.out.print(Consecutive(new int[] {5,10,15}));
    }
}