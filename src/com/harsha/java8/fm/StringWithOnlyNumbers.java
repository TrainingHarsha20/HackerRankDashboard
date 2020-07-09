package com.harsha.java8.fm;

public class StringWithOnlyNumbers {
    public static void main(String[] args) {
        String regex = "[0-9]+";
        System.out.println("34350".matches(regex));

        String regex2="[\\d]+";
        System.out.println("34350".matches(regex));
    }
}
