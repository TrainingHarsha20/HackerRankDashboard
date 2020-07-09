package com.harsha.hackerrank.interview;

public class StringAnagrams {
    String a = "cde";
    String b = "abc";

    static int makeAnagram(String a, String b) {
        int minDel = 0;
        int[] aFre = new int[26];
        int[] bFre = new int[26];

        updateFre(a, aFre);
        updateFre(b, bFre);

        for(int i=0; i<26; i++){
            int diff = Math.abs(aFre[i]-bFre[i]);
            minDel += diff;
        }
        return minDel;
    }

    private static void updateFre(String b, int[] bFre) {
        for (int i = 0; i < b.length(); i++) {
            int poistion = getPoistion(b, i);
            bFre[poistion]++;
        }
    }

    private static int getPoistion(String ip, int i) {
        char currentChar = ip.charAt(i);
        int currentIndex = (int) currentChar;
        return currentIndex - (int) 'a';
    }


    public static void main(String[] args) {
        String a = "cbe";
        String b = "abc";

        int op = makeAnagram(a, b);
        System.out.println( op );
    }
}
