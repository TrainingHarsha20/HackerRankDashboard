package com.harsha.hackerrank.interview;

import java.util.*;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class MinimumSum {

    public static int minimumSum(List<Integer> num, int k) {
        Collections.sort(num);

        num.stream()//.sorted(Collections.reverseOrder())
                .mapToInt(i -> {
                    int len = num.size();
                    Integer idx = num.indexOf(i);
                    System.out.println("value of i :: "+ i);
                    if(num.get(len -1)%2 ==0) {
                        num.set(idx,num.get(len -1)/2);
                    }else{
                        num.set(idx,(int) Math.ceil((double) num.get(len -1) / 2));
                    }
                    return i;
                })
                .forEach(System.out::println);

        for (int i = 0; i < k; i++) {
            int actLength = num.size() - 1;
            int idx = num.indexOf(num.get(actLength));
            if (num.get(actLength) % 2 == 0) {
                num.set(idx, num.get(actLength) / 2);
            } else {
                num.set(idx, (int) Math.ceil((double) num.get(actLength) / 2));
            }
            Collections.sort(num);
        }

        return num.stream().mapToInt(i -> i.intValue()).sum();
    }

    static int sum(List<Integer> data, int k) {
        //return 0 if list is null. to avoid nullpointer exception
        if(data.isEmpty()) return 0;
        // A PriorityQueue is used when the objects are supposed to be processed based on the priority.
        // It is known that a queue follows First-In-First-Out algorithm, but sometimes
        // the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play

// PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according
// to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.

//Data Order is overridden by a Comparator
        PriorityQueue<Integer> reveseArray = new PriorityQueue<>(Comparator.reverseOrder());
        //Passing all the values into array
        reveseArray.addAll(data);
        //looping until k =0
        while (k-- > 0) {
        // poll --> This method retrieves and removes the head of this queue, or returns null if this queue is empty.
        //re-adding new value into Priority Queue
            //Math.ceil return double because double is grater than Long. for that that reason we used 2double in denaminator
            reveseArray.add((int) Math.ceil(reveseArray.poll() / 2d));
        }
        //generate sum for minimized elements
        return reveseArray.stream().mapToInt(a -> a).sum();
    }

    public static void main(String[] args) {
        //input1
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(7);
//        long op = sum(a, 4);
        int op = minimumSum(a, 4);
        //input2
        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
//        int op = sum(b, 1);

        //input2
        List<Integer> c = new ArrayList<>();
//        b.add(1);
//        b.add(2);
//        int op = sum(b, 1);

//        int op = minimumSum(a, 4);
//        int op = minimumSum(new int[]{1,2}, 1);
//          int op = minimumSum(new int[]{2,3}, 1);
//        int op = minimumSum(new int[]{2,2,3}, 1);
        System.out.println("*************************");
        System.out.println( op );
    }

}
