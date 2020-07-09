package com.harsha.coderbyte;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LetterChanges {
    public static String LetterChanges(String str) {
        // code goes here
//        StringBuilder result = new StringBuilder();
        char[] strChars = str.toLowerCase().toCharArray();
        char[] replacements = {'b', 'c', 'd', 'E', 'f', 'g', 'h', 'I', 'j', 'k', 'l', 'm', 'n', 'O', 'p', 'q', 'r', 's', 't', 'U', 'v', 'w', 'x', 'y', 'z', 'A'};
        String sortedString =
                Stream.of(str.split(""))
                        .sorted()
                        .collect(Collectors.joining());
//        Arrays.sort(strChars);

//        System.out.println(strChars);
//        result.append(strChars);
//        for (int i = 0; i < str.length(); i++) {
////            result.append(strChars[i] >= 'a' && strChars[i] <= 'z' ? replacements[strChars[i] - 97] : strChars[i]);
//        }
       return sortedString;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextLine()));
    }
}