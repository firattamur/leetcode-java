package org.leetcodejava.problem_0005;

import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        String s = "babad";
        String expected = "aba";

        String actual = solution.longestPalindrome(s);

        assert actual.equals(expected);
    }

    @Test
    public void case2() {
        String s = "cbbd";
        String expected = "bb";

        String actual = solution.longestPalindrome(s);

        assert actual.equals(expected);
    }

    @Test
    public void case3() {
        String s = "a";
        String expected = "a";

        String actual = solution.longestPalindrome(s);

        assert actual.equals(expected);
    }

}
