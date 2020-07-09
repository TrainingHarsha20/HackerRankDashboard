package com.harsha.java8.fm;

public class LetterOccurrence {
    public static void main(String[] args) {
        String str= "geeksforgeeks";
        char c = 'e';
        getOccuringChar(str);
    }
    static void getOccuringChar(String str)
    {
        // Create an array of size 256 i.e. ASCII_SIZE
        int count[] = new int[256];
        int len = str.length();
        // Initialize count array index
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
            System.out.println("count[str.charAt(i)]++ ::" +count[str.charAt(i)]++ + " i :" + i);
        }

        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            System.out.println( ch[i] +" " + str.charAt(i));
            int find = 0;
            for (int j = 0; j <= i; j++) {
                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println("Number of Occurrence of " +
                        str.charAt(i) + " is:" + count[str.charAt(i)]);
        }
    }

}
