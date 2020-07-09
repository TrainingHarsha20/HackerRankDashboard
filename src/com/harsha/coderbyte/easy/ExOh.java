package com.harsha.coderbyte.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * Have the function ExOh(str) take the str parameter being passed and
 * return the string true if there is an equal number of x's and o's,
 * otherwise return the string false.
 *
 * Only these two letters will be entered in the string, no punctuation or numbers.
 * For example: if str is "xooxxxxooxo" then the output should return false because there are 6 x's and 5 o's.
 *
 */

public class ExOh {
    public static boolean findxoletters(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                Integer val = map.get(c);
                map.put(c,++val);
            }else{
                map.put(c,1);
            }
        }
        return (map.get('x') == map.get('o')) ? true : false;

//      Can be done using below code
//
//        String[] s = str.split("");
//        int countOfX=0, countOfO=0;
//        for(int i=0; i< s.length; i++){
//            String val = s[i];
//            if(val.equals("x")) {
//                countOfX++;
//            } else if(val.equals("o")) {
//                countOfO++;
//            }
//        }
        
//        return (countOfO == countOfX) ? true : false;
    }


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(findxoletters(s.nextLine()));
    }
}
