package com.harsha.java8.fm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class RangeOfInt {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(5);
        //to Reverse the elements in the list
//        Collections.reverseOrder();
        //Sorted in asending order
        Collections.sort(list);

        System.out.printf("list.size() :: %d%n" ,list.size());
        System.out.printf("get first element :: %d%n" ,list.get(list.size()-2));
        System.out.printf("list.get() :: %d%n" ,list.get(list.size()-1));
        for(int i = list.get(0); i< list.get(list.size()-1);i++){
            System.out.println("i :" + i);
        }

        System.out.println("*****************");
        IntStream
                .rangeClosed(list.get(0), list.get(list.size() - 1))
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
//        System.out.println("Sum ::" + s);

        String s = "the Planet of the Apes is world best movie.";
        System.out.println("first letter :: " + s.substring(0,1).toUpperCase());
        System.out.println("Substring of :: " + s.substring(1));
    }
}
