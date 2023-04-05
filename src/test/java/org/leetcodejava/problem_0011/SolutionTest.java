package org.leetcodejava.problem_0011;

import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int expected = 49;

        int actual = solution.maxArea(height);

        assert actual == expected;
    }

    @Test
    public void case2() {
        int[] height = {1,1};
        int expected = 1;

        int actual = solution.maxArea(height);

        assert actual == expected;
    }


}
