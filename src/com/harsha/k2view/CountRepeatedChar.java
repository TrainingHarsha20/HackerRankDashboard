package com.harsha.k2view;

import java.util.HashMap;

public class CountRepeatedChar {

    static int countChar(String s){
        char[] sChar = s.toCharArray();
        char prev = sChar[0];
        int counter = 0;
        for(int i=1;i<s.length()-1;i++){
            if(sChar[i-1] == sChar[i] && sChar[i] == sChar[i+1] && prev != sChar[i]){
                counter++;
                prev = sChar[i];
            }
        }
        return counter;
    }

   /* static int countChar(String s){
        char[] sChar = s.toCharArray();
        char prev = sChar[0];
        int counter = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(sChar[i])){
                Integer out = map.get(sChar[i]);
                map.put(sChar[i], ++out);
            }else{
                map.put(sChar[i], 1);
            }
        }

        if(map.containsValue(3)) counter++;
        return counter;
    }*/

    public static void main(String[] args){
        String input = "abdddaaa";
//        String input = "abcddda bc cbbcaaaa cc";
        System.out.println(countChar(input));
    }

}
