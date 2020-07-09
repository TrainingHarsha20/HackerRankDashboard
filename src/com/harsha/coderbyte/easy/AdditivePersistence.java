package com.harsha.coderbyte.easy;

import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Have the function AdditivePersistence(num) take the num parameter being passed which will always be a
 * positive integer and return its additive persistence which is the number of times you must add the digits in num
 * until you reach a single digit.
 *
 * For example: if num is 2718 then your program should return 2
 * because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9.
 *
 */
public class AdditivePersistence {

    public static int additivePersistence(int num) {
//        without mapping ➜ the quicker lambda solution
//        return Integer.toString(num).chars().boxed()
//                .collect(Collectors.summingInt( (c) -> c - '0' ));

//        …or Unicode compliant
        return Integer.toString(num).chars().boxed()
                .collect(Collectors.summingInt( Character::getNumericValue));
//        int sum = getAddPersistence(num, 0);
//        return sum;
    }

    static int getAddPersistence(int num, int count) {
        String numStr = String.valueOf(num);
        if (numStr.length() == 1) {
            return count;
        }

        int newNum = 0;
        for (char c : numStr.toCharArray()) {
            newNum += Integer.valueOf(String.valueOf(c));
        }
        return getAddPersistence(newNum, ++count);
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(additivePersistence(2178));
    }
}
