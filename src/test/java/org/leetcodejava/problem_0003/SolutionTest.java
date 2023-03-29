package org.leetcodejava.problem_0003;

import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        String s = "abcabcbb";
        int expected = 3;

        int actual = solution.lengthOfLongestSubstring(s);

        assert actual == expected;
    }

    @Test
    public void case2() {
        String s = "bbbbb";
        int expected = 1;

        int actual = solution.lengthOfLongestSubstring(s);

        assert actual == expected;
    }

    @Test
    public void case3() {
        String s = "pwwkew";
        int expected = 3;

        int actual = solution.lengthOfLongestSubstring(s);

        assert actual == expected;
    }

}
