package org.leetcodejava.problem_0007;

/*

Problem 7: Reverse Integer

    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

    Example 1:

    Input: x = 123
    Output: 321
    Example 2:

    Input: x = -123
    Output: -321
    Example 3:

    Input: x = 120
    Output: 21

    Constraints:

    -231 <= x <= 231 - 1

 */


public class Solution {

    /**
     * Solution: Build reverse by dividing by 10 and multiplying by 10 and check for overflow at each step.
     * <p>
     * Time complexity : O(log10(n))
     * Space complexity: O(1)
     * @param x is the integer
     * @return x with its digits reversed
     */
    public int reverse(int x) {

        if (x == Integer.MIN_VALUE) {
            return 0;
        }

        int sign = x < 0 ? -1 : 1;

        int reverse = 0;
        int tempX   = Math.abs(x);

        while (tempX != 0) {

            int digit = tempX % 10;

            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            reverse = reverse * 10 + digit;
            tempX /= 10;

        }

        return reverse * sign;

    }

}
