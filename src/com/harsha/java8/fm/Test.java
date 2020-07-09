package com.harsha.java8.fm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {


    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList();
//        System.out.println("First stmt");
//
//        Stream<String> beforeTerminal = list.stream().map(s -> {
//            System.out.printf("Second stmt : %s\n", s);
//            return s.toUpperCase();
//        });
//
//
//        System.out.println("Third stmt");

        String s1 = "army";
        String s2 = "1ary";
        char[] s1Array = s1.toLowerCase().toCharArray();
        char[] s2Array = s2.toLowerCase().toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        int res = Arrays.compare(s1Array, s2Array);
        System.out.println( res  );
        System.out.println( res == 0 ? true : false );

        /*
        boolean flag = false;
        for(int i =0 ; i<s1Array.length; i++){
            if(s1Array[i] != s2Array[i]) {
                break;
            }else {
                flag = true;
            }
        }
        System.out.println(" is Anagram :: "+ flag);
*/


    }

}
