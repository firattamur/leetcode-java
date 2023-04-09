package org.leetcodejava.problem_0014;

/*

Problem: Longest Common Prefix

    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".

    Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.


    Constraints:

    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lowercase English letters.

*/

public class Solution {

    /**
     * Solution: Compare the first string with the rest of the strings, and keep the common prefix.
     * <p>
     * Time complexity : O(n*m) where n is the number of strings, and m is the length of the shortest string.
     * Space complexity: O(1)
     * @param strs is the array of strings
     * @return the longest common prefix string
     */
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String commonPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
            }
        }

        return commonPrefix;

    }

}
