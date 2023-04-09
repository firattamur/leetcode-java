package org.leetcodejava.problem_0014;

import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void case1() {
        String[] strs = {"flower","flow","flight"};
        String expected = "fl";

        String actual = solution.longestCommonPrefix(strs);

        assert actual.equals(expected);
    }

    @Test
    public void case2() {
        String[] strs = {"dog","racecar","car"};
        String expected = "";

        String actual = solution.longestCommonPrefix(strs);

        assert actual.equals(expected);
    }

}
