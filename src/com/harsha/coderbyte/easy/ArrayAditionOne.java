package com.harsha.coderbyte.easy;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

/**
 * Have the function ArrayAdditionI(arr) take the array of numbers stored in arr and return the string true if any
 * combination of numbers in the array can be added up to equal the largest number in the array, otherwise return the
 * string false. For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because
 * 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the same elements,
 * and may contain negative numbers.
 *
 * @author Sri Vemulapalli
 */

public class ArrayAditionOne {
    public static String arrayAditionOne(int[] arr) {
        int[] sortArray = stream(arr).sorted().toArray();
        int maxVal = stream(sortArray).max().getAsInt();
        int newMax = maxVal;
//                IntStream.iterate(num,i->i-1).limit(num).forEach(i -> {
//            ref.sum = ref.sum *i;
//        });


        for(int i =sortArray.length-2; i> 0; i--) {
            if (maxVal - sortArray[i] == 0) {
                return "true";
            } else{
                maxVal -= sortArray[i];
            }
        }
        return "false";
    }

    public static void main (String[] args) {
                int[] input =  {4, 6, 23, 10, 1, 3};
//        int[] input =  {2, 6, 18, 54};
//        int[] input =  {2, 6, 18, 52};

        Scanner s = new Scanner(System.in);
        System.out.println(arrayAditionOne(input));
    }
}
