package com.harsha.leetcoder.easy;

import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 */
public class ValidParentheses {
    public boolean isValid(String s) {

        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the current character is a closing bracket.
            if (mappings.containsKey(c)) {
                if(stack.empty()||stack.pop()!=mappings.get(c))return false;
            }else{
                stack.push(c);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) throws IOException {
        ValidParentheses ri = new ValidParentheses();
        System.out.println(ri.isValid("(]"));
        System.out.println(ri.isValid("([)]"));
        System.out.println(ri.isValid("{[]}"));
    }
}
