package org.leetcodejava.problem_0007;

import org.junit.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void case1() {
        int x = 123;
        int expected = 321;

        int actual = solution.reverse(x);

        assert actual == expected;
    }

    @Test
    public void case2() {
        int x = -123;
        int expected = -321;

        int actual = solution.reverse(x);

        assert actual == expected;
    }

    @Test
    public void case3() {
        int x = 120;
        int expected = 21;

        int actual = solution.reverse(x);

        assert actual == expected;
    }

    @Test
    public void case4() {
        int x = 1534236469;
        int expected = 0;

        int actual = solution.reverse(x);

        assert actual == expected;
    }

}
