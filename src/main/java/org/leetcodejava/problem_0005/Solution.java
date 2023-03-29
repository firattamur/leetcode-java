package org.leetcodejava.problem_0005;

/*

Problem 5: Longest Palindromic Substring

    Given a string s, return the longest palindromic substring in s.

    Example 1:

    Input: s = "babad"
    Output: "bab"
    Explanation: "aba" is also a valid answer.
    Example 2:

    Input: s = "cbbd"
    Output: "bb"


    Constraints:

    1 <= s.length <= 1000
    s consist of only digits and English letters.

 */


public class Solution {

    /**
     * Solution: Expand from Middle
     * Iterate through the string and expand from the middle.
     * <p>
     * Time complexity : O(n^2)
     * Space complexity: O(1)
     * @param s is the string to find the longest palindromic substring
     * @return the longest palindromic substring
     */
    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0)
            return "";

        if (s.length() == 1)
            return s;

        int firstIndex = 0;
        int lastIndex = 0;

        for (int i = 0; i < s.length(); i++) {

            int length1 = expandFromMiddle(s, i, i);
            int length2 = expandFromMiddle(s, i, i + 1);

            int length = Math.max(length1, length2);

            if (length > lastIndex - firstIndex) {
                firstIndex = i - ((length - 1) / 2);
                lastIndex = i + (length / 2);
            }

        }

        return s.substring(firstIndex, lastIndex + 1);

    }

    /**
     * Expand from the middle of the string and return the length of the palindrome.
     * <p>
     * Time complexity : O(n)
     * Space complexity: O(1)
     * @param s is the string
     * @param left is the left index
     * @param right is the right index
     * @return the length of the palindrome
     */
    private int expandFromMiddle(String s, int left, int right) {

        if (s == null || left > right)
            return 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;

    }


}
