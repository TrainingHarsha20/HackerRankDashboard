package com.harsha.hackerrank.interview.stringmanipulation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndTheValidString {
    // Complete the isValid function below.
    static String isValid(String s) {
     Map<Character, Integer> map = new HashMap<Character, Integer>();
     for(char c: s.toCharArray()){
        map.putIfAbsent(c, 0);
        map.computeIfPresent(c, (k,v) -> v+1);
     }

    Set<Integer> values = new HashSet<>(map.values());
    if(values.size() == 1) {
        return "YES";
    }
    if (values.size() > 2){
        return "NO";
    }

    int max = 0, min = Integer.MAX_VALUE, sameAsMin=0, sameAsMax = 0;
    for(int value : values){
        if(value > max) max = value;
        if (value < min) min = value;
    }

    for(int val :map.values()){
        if(val == min) ++sameAsMin;
        if(val == max) ++sameAsMax;
    }

    if(min ==1 && sameAsMin==1) return "YES";
    if((max-min) == 1 && sameAsMax ==1) return "YES";
    return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);
        System.out.println( " result : " + result);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
