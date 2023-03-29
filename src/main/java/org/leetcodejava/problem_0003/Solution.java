package org.leetcodejava.problem_0003;

/*

Problem: Longest Substring Without Repeating Characters

    Given a string s, find the length of the longest substring without repeating characters.

    Example 1:

    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.
    Example 2:

    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.
    Example 3:

    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


    Constraints:

    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.

 */

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * Solution: Sliding Window
     * Iterate through the string and store the characters in a map.
     * If the character already exists in the map, then move the first index to the next index of the character.
     * <p>
     * Time complexity : O(n)
     * Space complexity: O(n)
     *
     * @param s is the string
     * @return the length of the longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0)
            return 0;

        int firstIndex  = 0;
        int lastIndex  = 0;
        int maxLength  = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (map.containsKey(c)) {

                if (lastIndex - firstIndex + 1 > maxLength)
                    maxLength = lastIndex - firstIndex + 1;

                firstIndex = Math.max(firstIndex, map.get(c) + 1);

            }

            map.put(c, i);
            lastIndex = i;

        }

        if (lastIndex - firstIndex + 1 > maxLength)
            maxLength = lastIndex - firstIndex + 1;

        return maxLength;

    }

}
