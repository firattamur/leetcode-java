package org.leetcodejava.problem_0020;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void case1() {
        String s = "()";
        boolean expected = true;

        boolean actual = solution.isValid(s);

        assert actual == expected;
    }

    @Test
    public void case2() {
        String s = "()[]{}";
        boolean expected = true;

        boolean actual = solution.isValid(s);

        assert actual == expected;
    }

    @Test
    public void case3() {
        String s = "(]";
        boolean expected = false;

        boolean actual = solution.isValid(s);

        assert actual == expected;
    }

}
