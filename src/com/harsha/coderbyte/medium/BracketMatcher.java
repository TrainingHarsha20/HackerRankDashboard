package com.harsha.coderbyte.medium;

import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static java.util.stream.StreamSupport.stream;

/**
 * Have the function BracketMatcher(str) take the str parameter being passed and
 * return 1 if the brackets are correctly matched and each one is accounted for. Otherwise return 0.
 *
 * For example: if str is "(hello (world))", then the output should be 1,
 * but if str is "((hello (world))" the the output should be 0 because the brackets do not correctly match up.
 * Only "(" and ")" will be used as brackets. If str contains no brackets return 1.
 */
public class BracketMatcher {

    static int bMatcher(String str) {

        AtomicInteger openBracket = new AtomicInteger(0);
        CharBuffer.wrap(str.toCharArray())
                .chars()
                .mapToObj(c -> {
                    if( c == '('){
                        openBracket.getAndIncrement();
                    }else if(c == ')'){
                        openBracket.decrementAndGet();
                    }
                    return c;
                }).forEach(c -> {});
        return openBracket.get() > 0 ? 0: 1;

       /* int start = 0, end = 0, i=0;
        for(char c : str.toCharArray()){
            if(c == '('){
                start++;
            }else if( c == ')'){
                end++;
            }

            if (end > start) break;
        }

        return end == start ? 1 : 0;
*/

    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(bMatcher(s.nextLine()));
    }
}
