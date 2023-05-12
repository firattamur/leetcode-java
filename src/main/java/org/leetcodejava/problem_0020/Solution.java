package org.leetcodejava.problem_0020;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {

        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else if (c == ')' && stack.pop() != '(') {
                return false;
            } else if (c == '}' && stack.pop() != '{') {
                return false;
            } else if (c == ']' && stack.pop() != '[') {
                return false;
            }

        }

        return stack.isEmpty();

    }

}
