package com.harsha.java8.forloop.withoutfilter;

import java.util.HashMap;
import java.util.Map;

public class ForEachToMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "Jan");
        map.put("2", "Feb");
        map.put("3", "Mar");
        map.put("4", "Apr");
        map.put("5", "May");
        map.put("6", "Jun");

        //Before Java8
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }

        //Java8 using lambda
        System.out.println(" ");
        map.forEach((k,v) -> System.out.println("Item : " + k + " Count : " + v));

        //Java8 Map Filtering
        System.out.println(" Java8 Map Filtering ");
        map.entrySet().stream()
                .filter(x -> "Jan".equals(x.getValue()))
                .forEach( x -> System.out.println("Key : " + x.getKey() + " Value : " + x.getValue()));

    }
}
