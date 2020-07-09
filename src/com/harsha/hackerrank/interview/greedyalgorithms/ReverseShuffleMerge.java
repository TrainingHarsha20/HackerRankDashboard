package com.harsha.hackerrank.interview.greedyalgorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * Given a string, , we define some operations on the string as follows:
 *
 * a.  denotes the string obtained by reversing string . Example:
 *
 *
 * b.  denotes any string that's a permutation of string . Example:
 *
 *
 * c.  denotes any string that's obtained by interspersing the two strings  & , maintaining the order of characters in both. For example,  & , one possible result of  could be , another could be , another could be  and so on.
 *
 * Given a string  such that  for some string , find the lexicographically smallest .
 *
 * For example, . We can split it into two strings of . The reverse is  and we need to find a string to shuffle in to get . The middle two characters match our reverse string, leaving the  and  at the ends. Our shuffle string needs to be . Lexicographically , so our answer is .
 *
 * Function Description
 *
 * Complete the reverseShuffleMerge function in the editor below. It must return the lexicographically smallest string fitting the criteria.
 *
 * reverseShuffleMerge has the following parameter(s):
 *
 * s: a string
 * Input Format
 *
 * A single line containing the string .
 *
 * Constraints
 *
 *  contains only lower-case English letters, ascii[a-z]
 * Output Format
 *
 * Find and return the string which is the lexicographically smallest valid .
 *
 * Sample Input 0
 *
 * eggegg
 * Sample Output 0
 *
 * egg
 * Explanation 0
 *
 * Split "eggegg" into strings of like character counts: "egg", "egg"
 * reverse("egg") = "gge"
 * shuffle("egg") can be "egg"
 * "eggegg" belongs to the merge of ("gge", "egg")
 *
 * The merge is: gge.
 *
 * 'egg' < 'gge'
 *
 * Sample Input 1
 *
 * abcdefgabcdefg
 * Sample Output 1
 *
 * agfedcb
 * Explanation 1
 *
 * Split the string into two strings with like characters:  and .
 * Reverse  =
 * Shuffle  can be
 * Merge to bcdefga
 *
 * Sample Input 2
 *
 * aeiouuoiea
 * Sample Output 2
 *
 * aeiou
 * Explanation 2
 *
 * Split the string into groups of like characters:
 * Reverse  =
 * These merge to uoiea
 */
public class ReverseShuffleMerge {
    // Complete the reverseShuffleMerge function below.
    static String reverseShuffleMerge(String s) {

        int[] count = new int[26];
        int[] used = new int[26], remain = new int[26];
        for (int i = 0; i < s.length(); i++) {
//            The reason for - 'A', is that it "shifts" the ascii/unicode value so that A - Z have values 0 - 25.
//            And are thus more suitable as an array index.
//            By subtracting character 'A' from an arbitrary character in a string,
//            you get the letter's index in the array:
            int val = s.charAt(i) - 'a';
            System.out.println( "val :: " + val + " <--> " +s.charAt(i) + " <--> " + (s.charAt(i) - 'a') );
            count[val]++;
//            remain[i] = count[val];
        }

        StringBuilder sb = new StringBuilder();
//        int[] used = new int[26], remain = new int[26];
        for (int i = 0; i < count.length; i++) {
            remain[i] = count[i];
        }
        //increment update array by 1 and decrement remain by 1 if we are adding first time.
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (sb.length() == 0) {
                sb.append(c);
                used[c - 'a']++;
            }else {
                //check if both used = count then reduce and continue
                if (2 * used[c - 'a'] == count[c - 'a']) {
                    remain[c - 'a']--;
                    continue;
                }

                while (sb.length() > 0) {
                    char last = sb.charAt(sb.length() - 1);
                    int idx = last -'a';
                    if (c < last && 2 * (remain[idx] + used[idx]) > count[idx]){
                        used[idx]--;
                        sb.deleteCharAt(sb.length() - 1);
                    }else {
                        break;
                    }
                }

                sb.append(c);
                used[c - 'a']++;
            }
            remain[c - 'a']--;
        }
        return sb.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = reverseShuffleMerge(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

