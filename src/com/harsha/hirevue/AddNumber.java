package com.harsha.hirevue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;

public class AddNumber {

    static int sum(String str) {
        return IntStream.range(1, Integer.valueOf(str)+1)
                .filter(i -> i % 5 != 0)
                .filter(i -> i % 7 != 0)
                .sum();
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
//        while ((line = in.readLine()) != null) {
//            System.out.println(line);
//        }

        System.out.println(sum("19"));
    }
}