package com.harsha.java8.fm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 *
 * Accept array of Integers  and print list of range
 */
public class RangeOfIntegers {

    static int printListOfRange(ArrayList<Integer> list){

//        Collections.sort(list);
//        for(int i = list.get(0); i<= list.get(list.size()-1); i++){
//            if(list.contains(i)) System.out.println(" available in the list");
//                else System.out.println(i);
//        }
//
        list.stream().sorted().forEach(System.out::println);
        System.out.println(list.stream().sorted().findFirst());

        return 1;
    }
    static int printListOfNumbersInRange(int[] nums){

        Arrays.sort(nums);
        int start = nums[0];
        int end = nums[nums.length-1];
        System.out.println( "end :: " + end);

        for(int i=start; i<end; i++){
            int temp = 0;
            for(int j : nums){
                if(i == j) temp = j;
                break;
            }
            if(temp == 0) System.out.println( i);
        }
        System.out.println("***************");
        IntStream.range(nums[0],nums[nums.length-1])
       .forEach(i -> {
            AtomicInteger temp = new AtomicInteger();
            IntStream.of(nums).forEach(j -> {
                if(i!= j) temp.set(j);
            });

            if(temp.get() == 0) System.out.println( i);
        });
        return 0;
    }

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(10);

        System.out.println( printListOfRange(list));
        System.out.println("****************");
        System.out.println( printListOfNumbersInRange(new int[]{5,15,10}));

    }
}
