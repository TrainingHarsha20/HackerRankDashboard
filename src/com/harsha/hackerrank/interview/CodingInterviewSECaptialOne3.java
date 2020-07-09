package com.harsha.hackerrank.interview;

import com.harsha.leetcoder.ListNode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Given two array of characters, add them together like an addition problem and return them in a char array.
 *
 *    ['3', '5', '9'] ['1', '2', '8', '4'] = 1284 + 359 = 1643 = ['1', '6', '4', '3']
 *
 */
public class CodingInterviewSECaptialOne3 {

    public static void main(String args[]) {

        // let's first create two arrays
        int[] even = { 2, 4, 6 };
        int[] odd = { 1, 3, 5 };

        int[] even1 ={'3', '5', '9'};
        int[] odd1 = {'1', '2', '8', '4'};

        //check both arrays are null or size is less than 1
        // return 0

       StringBuilder sbEven = new StringBuilder();
       StringBuilder sbOdd = new StringBuilder();

       for(int i=0; i< even1.length-1;i++){
           int val = even1[i] - '0';
           int val2 = Character.getNumericValue(even1[i]);
           sbEven.append(val);
       }

        for(int i=0; i< odd1.length-1;i++){
            sbOdd.append(Character.getNumericValue(even1[i]));
        }

//        String sbEven = IntStream.of(even1).filter().mapToObj(String::valueOf).collect(Collectors.joining());
//        String sbOdd = IntStream.of(odd1).mapToObj(String::valueOf).collect(Collectors.joining());


        int total = Integer.valueOf(sbEven.toString()) + Integer.valueOf(sbOdd.toString());
        char[] newL = String.valueOf(total).toCharArray();
        int[] outP = new int[newL.length];
        for (int i = 0; i < newL.length; i++){
            outP[i] = Character.getNumericValue(newL[i]);
        }
        System.out.println(outP);
//['3', '5', '9'] ['1', '2', '8', '4'] = 1284 + 359 = 1643 = ['1', '6', '4', '3']
        int i = even1.length > odd1.length ? even1.length-1 : odd1.length-1;
        int[] newIntL = new int[i+1];
        if(even1.length > odd1.length){
            getOut(even1.length-1,odd1,even1,( even1.length-odd1.length ),newIntL);
        }else if(even1.length < odd1.length){
            getOut(odd1.length-1,even1,odd1,( odd1.length-even1.length ),newIntL);
        }else{
            //create logic both of them matches.
        }
    }


    public static int[] getOut(int i, int[] even1, int[] odd1, int diff, int[] updatedList){
        int carry = 0;
        while(i>=0){
            int x = (i < even1.length && even1[i] != 0) ? (i != 0) ? even1[i-1] - '0' : 0 : even1[i-diff] - '0';
            int y = (i< odd1.length && odd1[i] != 0) ? odd1[i] - '0' : odd1[i-diff] - '0';

            int sum = x+y+carry;
            carry = sum/10;
            int val = sum%10;
            System.out.println( " val ::" + val);
            updatedList[i] = val;
            i--;
        }
        return updatedList;
    }


}
