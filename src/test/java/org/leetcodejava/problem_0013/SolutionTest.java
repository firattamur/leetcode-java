package org.leetcodejava.problem_0013;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void case1() {
        String s = "III";
        int expected = 3;

        int actual = solution.romanToInt(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case2() {
        String s = "LVIII";
        int expected = 58;

        int actual = solution.romanToInt(s);

        assertEquals(expected, actual);
    }

    @Test
    public void case3() {
        String s = "MCMXCIV";
        int expected = 1994;

        int actual = solution.romanToInt(s);

        assertEquals(expected, actual);
    }

}
