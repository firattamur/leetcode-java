package org.leetcodejava.problem_0008;

import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void case1() {
        String x = "42";
        int expected = 42;

        int actual = solution.myAtoi(x);

        assert actual == expected;
    }

    @Test
    public void case2() {
        String x = "   -42";
        int expected = -42;

        int actual = solution.myAtoi(x);

        assert actual == expected;
    }

    @Test
    public void case3() {
        String x = "4193 with words";
        int expected = 4193;

        int actual = solution.myAtoi(x);

        assert actual == expected;
    }

    @Test
    public void case4() {
        String x = "words and 987";
        int expected = 0;

        int actual = solution.myAtoi(x);

        assert actual == expected;
    }

    @Test
    public void case5() {
        String x = "-91283472332";
        int expected = -2147483648;

        int actual = solution.myAtoi(x);

        assert actual == expected;
    }

    @Test
    public void case6() {
        String x = "+-12";
        int expected = 0;

        int actual = solution.myAtoi(x);

        assert actual == expected;
    }

    @Test
    public void case7() {
        String x = "   +0 123";
        int expected = 0;

        int actual = solution.myAtoi(x);

        assert actual == expected;
    }

    @Test
    public void case8() {
        String x = "9223372036854775808";
        int expected = 2147483647;

        int actual = solution.myAtoi(x);

        assert actual == expected;
    }

    @Test
    public void case9() {
        String x = "00000-42a1234";
        int expected = 0;

        int actual = solution.myAtoi(x);

        assert actual == expected;
    }

}
