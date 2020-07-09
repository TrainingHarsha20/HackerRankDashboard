package com.harsha.coderbyte.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.StreamSupport.stream;

/**
 * Have the function OffLineMinimum(strArr) take the strArr parameter being passed which will be an array of integers
 * ranging from 1...n and the letter "E" and return the correct subset based on the following rules.
 *
 * The input will be in the following format: ["I","I","E","I",...,"E",...,"I"]
 * Where the I's stand for integers and the E means take out the smallest integer currently in the whole set.
 *
 * When finished, your program should return that new set with integers separated by commas.
 * For example: if strArr is ["5","4","6","E","1","7","E","E","3","2"] then your program should return 4,1,5.
 *
 */
public class OffLineMinimum {

    public static String findMini(String[] strArr) {
        List<Integer> allNumbers = new ArrayList<Integer>();
        List<Integer> numbers = new ArrayList<Integer>();

        for (String str : strArr) {
            if (str.equals("E")) {
                moveSmallestNum(allNumbers, numbers);
            } else {
                allNumbers.add(Integer.parseInt(str));
            }
        }

        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < numbers.size(); i++) {
            builder.append(numbers.get(i));
            if (i < numbers.size() - 1) builder.append(",");
        }
        return builder.toString();
    }

    static void moveSmallestNum(List<Integer> allNumbers, List<Integer> numbers){
        Collections.sort(allNumbers);
        Integer minNum = allNumbers.get(0);
        numbers.add(minNum);
        allNumbers.remove(minNum);
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = new String[]{"5", "4", "6", "E", "1", "7", "E", "E", "3", "2"};
        System.out.println(findMini(input));
    }
}