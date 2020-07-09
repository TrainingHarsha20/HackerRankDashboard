package com.harsha.coderbyte.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

/**
 * Have the function ArrayAdditionI(arr) take the array of numbers stored in arr and
 * return the string true if any combination of numbers in the array can be added up to equal the largest number in the array,
 * otherwise return the string false.
 *
 * For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true
 * because 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the same elements,
 * and may contain negative numbers.
 */
public class ArrayAddition {

    static String arrayAddition(int[] arr){
        AtomicReference<Integer> sum = new AtomicReference(arr[arr.length-1]);
        AtomicReference<String> output = new AtomicReference("false");

        IntStream.range(0,arr.length-1)
                .boxed() // Converts Intstream to Stream<Integer>
                .sorted(Collections.reverseOrder()) //reversing the array
                .map(i -> {
                    sum.set(sum.get() - arr[i]);
                    return sum.get();
                })
                .forEach(i -> {
                    if(sum.get() == 0){
                        output.set("true");
                    }
                });
        return output.get();
/*
        //Before Java8
        int sum = arr[arr.length-1];
        for(int i = arr.length-2;i>0;i--){
            sum = sum -arr[i];
            if(sum == 0){
                return "true";
            }
        }
        return "false";
        */
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(arrayAddition(new int[]{4, 6, 23, 10, 1, 3}));
    }

}
