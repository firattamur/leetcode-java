package org.leetcodejava.problem_0006;

/*

Problem: ZigZag Conversion

    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

    P   A   H   N
    A P L S I I G
    Y   I   R

    And then read line by line: "PAHNAPLSIIGYIR"

    Write the code that will take a string and make this conversion given a number of rows:

    string convert(string s, int numRows);

    Example 1:

    Input: s = "PAYPALISHIRING", numRows = 3
    Output: "PAHNAPLSIIGYIR"
    Example 2:

    Input: s = "PAYPALISHIRING", numRows = 4
    Output: "PINALSIGYAHRPI"
    Explanation:
    P     I    N
    A   L S  I G
    Y A   H R
    P     I
    Example 3:

    Input: s = "A", numRows = 1
    Output: "A"


    Constraints:

    1 <= s.length <= 1000
    s consists of English letters (lower-case and upper-case), ',' and '.'.
    1 <= numRows <= 1000

 */

public class Solution {

    /**
     * Solution: ZigZag Conversion, iterate through the string and append to the correct row by help of directionDown boolean.
     * <p>
     * Time complexity : O(n)
     * Space complexity: O(n)
     * @param s is the string to convert
     * @param numRows is the number of rows
     * @return the converted string
     */
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean directionDown = true;

        for (char c : s.toCharArray()) {

            rows[currentRow].append(c);

            if (currentRow == 0) {
                directionDown = true;
            } else if (currentRow == numRows - 1) {
                directionDown = false;
            }

            currentRow += directionDown ? 1 : -1;

        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();

    }

    /**
     * Solution: ZigZag Conversion, iterate through the string and append to the correct row by help index calculation.
     * This is slower than the first because calculating the index is more expensive than using a boolean.
     * <p>
     * Time complexity : O(n)
     * Space complexity: O(n)
     * @param s is the string to convert
     * @param numRows is the number of rows to convert to
     * @return the converted string
     */
    public String convertSlow(String s, int numRows) {

        String convertedString = "";

        if (numRows == 1) {
            return s;
        }

        for (int i = 0; i < numRows; i++) {
            int currentIndex = i;
            while (currentIndex < s.length()) {
                convertedString += s.charAt(currentIndex);
                currentIndex = findNextIndex(currentIndex, numRows);
            }
        }

        return convertedString;

    }

    /**
     * Find the next index to append to the converted string.
     * @param currentIndex
     * @param numRows
     * @return the next index
     */
    private int findNextIndex(int currentIndex, int numRows) {

        int constant = numRows + (numRows - 2);

        if (currentIndex % constant == 0) {
            return currentIndex + constant;
        } else {
            return currentIndex + (constant - (currentIndex % (constant / 2)) * 2);
        }

    }

}
