package org.leetcodejava.problem_0010;

import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        String s = "aa";
        String p = "a";
        boolean expected = false;

        boolean actual = solution.isMatch(s, p);

        assert actual == expected;
    }

    @Test
    public void case2() {
        String s = "aa";
        String p = "a*";
        boolean expected = true;

        boolean actual = solution.isMatch(s, p);

        assert actual == expected;
    }

    @Test
    public void case3() {
        String s = "ab";
        String p = ".*";
        boolean expected = true;

        boolean actual = solution.isMatch(s, p);

        assert actual == expected;
    }

    @Test
    public void case4() {
        String s = "aab";
        String p = "c*a*b";
        boolean expected = true;

        boolean actual = solution.isMatch(s, p);

        assert actual == expected;
    }

    @Test
    public void case5() {
        String s = "mississippi";
        String p = "mis*is*p*.";
        boolean expected = false;

        boolean actual = solution.isMatch(s, p);

        assert actual == expected;
    }

    @Test
    public void case6() {
        String s = "ab";
        String p = ".*c";
        boolean expected = false;

        boolean actual = solution.isMatch(s, p);

        assert actual == expected;
    }

    @Test
    public void case7() {
        String s = "aaa";
        String p = "a*a";
        boolean expected = true;

        boolean actual = solution.isMatch(s, p);

        assert actual == expected;
    }

}
