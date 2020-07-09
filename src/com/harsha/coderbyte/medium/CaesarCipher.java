package com.harsha.coderbyte.medium;

import java.nio.CharBuffer;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Have the function CaesarCipher(str,num) take the str parameter and
 * perform a Caesar Cipher shift on it using the num parameter as the shifting number.
 * A Caesar Cipher works by shifting each letter in the string N places down in the alphabet (in this case N will be num).
 *
 * Punctuation, spaces, and capitalization should remain intact.
 * For example if the string is "Caesar Cipher" and num is 2 the output should be "Ecguct Ekrjgt".
 *
 */
public class CaesarCipher {
    static String  cCipher(String str,int num){
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        final String UPPER_ALPHABET = ALPHABET.toUpperCase();

        StringBuilder sb = new StringBuilder();
        for(char c: str.toCharArray()){
            int lowerIdx = ALPHABET.indexOf(c);
            int upperIdx = UPPER_ALPHABET.indexOf(c);
            if(lowerIdx > -1){
                sb.append(ALPHABET.charAt(lowerIdx+num));
            }else if( upperIdx > -1) {
                sb.append(UPPER_ALPHABET.charAt(upperIdx+num));
            }else{
                sb.append(" ");
            }
        }
        return sb.toString();

    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(cCipher("Caesar Cipher", 2));
    }
}
