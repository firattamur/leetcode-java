package org.leetcodejava.problem_0009;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void case1() {
        int x = 121;
        boolean expected = true;

        boolean actual = solution.isPalindrome(x);

        assertEquals(expected, actual);
    }

    @Test
    public void case2() {
        int x = -121;
        boolean expected = false;

        boolean actual = solution.isPalindrome(x);

        assertEquals(expected, actual);
    }

    @Test
    public void case3() {
        int x = 10;
        boolean expected = false;

        boolean actual = solution.isPalindrome(x);

        assertEquals(expected, actual);
    }

}
