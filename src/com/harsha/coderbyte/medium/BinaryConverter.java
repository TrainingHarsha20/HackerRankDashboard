package com.harsha.coderbyte.medium;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Have the function BinaryConverter(str) return the decimal form of the binary value.
 * For example: if 101 is passed return 5, or if 1000 is passed return 8.
 */
public class BinaryConverter {

    static int binaryCon(String str) {
        return Integer.parseInt(str, 2);
    }

        public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(binaryCon(s.nextLine()));
    }

}
