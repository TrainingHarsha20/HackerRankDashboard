package com.harsha.java8.forloop.withoutfilter;

import java.util.ArrayList;
import java.util.List;

public class ForEachToList {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        for(String item : items){
            System.out.println(item);
        }
        System.out.println("");
        //Java8
        //method reference
        items.forEach(System.out::println);

        //Stream and filter
        //Output : B
        System.out.println("before printing with stream and filter");
        items.stream()
                .filter(s->s.contains("B"))
                .forEach(System.out::println);


        String a = "";
        char[] aa = a.toCharArray();

        }
}
