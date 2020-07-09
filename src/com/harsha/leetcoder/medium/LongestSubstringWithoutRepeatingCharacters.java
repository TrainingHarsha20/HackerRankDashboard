package com.harsha.leetcoder.medium;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *         Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right <s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                max = Math.max(max, set.size());
            }else{
                set.remove(s.charAt(right));
                left++;
            }
        }
        return max;
    }

    //High Complexity
    public int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
    public int test(String s) {
        String t = s+s;
        System.out.println( "t ::" + t);
        int tIdx = t.indexOf(s, 1);
        System.out.println("tIdx::" + tIdx);
        return s.substring(0,tIdx).length();
    }


    public static void main(String[] args) throws IOException {
        LongestSubstringWithoutRepeatingCharacters atn = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(atn.lengthOfLongestSubstring1("abcabcbb"));
        System.out.println(atn.lengthOfLongestSubstring1("bbbbb"));
        System.out.println(atn.lengthOfLongestSubstring1("pwwkew"));

        System.out.println("*******************");
        System.out.println(atn.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(atn.lengthOfLongestSubstring("bbbbb"));
        System.out.println(atn.lengthOfLongestSubstring("pwwkew"));

        System.out.println(atn.test("bbbbb"));
        System.out.println(atn.test("abcabcabc"));


    }
}
