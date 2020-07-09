package com.harsha.hirevue;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.IntStream;

public class BeautifulStrings {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            System.out.println(beautyMax(line));
        }

    }

    private static int beautyMax(String sentence) {
        int[] counts = new int[26];
        IntStream.range(0, sentence.length())
                .map(i -> (int)sentence.charAt(i))
                .map(c -> (c >= 'a' && c <= 'z')
                        ? (c - 'a')
                        : ((c >= 'A' && c <= 'Z') ? (c - 'A') : -1 ))
                .filter(i -> i >= 0)
                .forEach(i -> counts[i]++);
        Arrays.sort(counts);

        return IntStream.range(0, 26).map(i -> counts[i] * (i + 1)).sum();
    }
}