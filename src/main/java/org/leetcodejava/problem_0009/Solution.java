package org.leetcodejava.problem_0009;

/*

    Given an integer x, return true if x is a palindrome, and false otherwise.

    Example 1:

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
    Example 2:

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:

    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

    Constraints:

    -231 <= x <= 231 - 1

    Follow up: Could you solve it without converting the integer to a string?

 */


public class Solution {

    /**
     * Solution: Build reverse by dividing by 10 and multiplying by 10
     * <p>
     * Time complexity : O(log10(n))
     * Space complexity: O(1)
     * @param x is the integer
     * @return true if x is a palindrome, and false otherwise
     */
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverse = 0;

        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }

        return x == reverse || x == reverse / 10;

    }

}
