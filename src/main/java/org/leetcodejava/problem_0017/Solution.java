package org.leetcodejava.problem_0017;

/*

    Problem 17: Letter Combinations of a Phone Number

    Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

    A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

    Example 1:

    Input: digits = "23"
    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    Example 2:

    Input: digits = ""
    Output: []
    Example 3:

    Input: digits = "2"
    Output: ["a","b","c"]


    Constraints:

    0 <= digits.length <= 4
    digits[i] is a digit in the range ['2', '9'].


 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {

    /*

        Solution: Backtracking algorithm

        Time complexity: O(n * 4^n)
        Space complexity: O(n * 4^n)

     */
    public List<String> letterCombinations(String digits) {

        Map<Character, String> map = Map.of(
                '2', "abc",
                '3', "def",
                '4', "ghi",
                '5', "jkl",
                '6', "mno",
                '7', "pqrs",
                '8', "tuv",
                '9', "wxyz"
        );

        List<String> result = new ArrayList();

        if (digits.length() != 0) {
            backtrack(digits, map, result, new StringBuilder(), 0);
        }

        return result;

    }

    /*
        Backtracking algorithm:
            - Choose a digit from the input string digits at index i and append it to the current combination.

        Time complexity: O(n * 4^n)
     */
    private void backtrack(String digits, Map<Character, String> map, List<String> result, StringBuilder sb, int index) {

        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = map.get(digit);

        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            backtrack(digits, map, result, sb, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }

    }

}
