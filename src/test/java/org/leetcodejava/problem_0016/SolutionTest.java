package org.leetcodejava.problem_0016;

import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int expected = 2;

        int actual = solution.threeSumClosest(nums, target);

        assert actual == expected;
    }

    @Test
    public void case2() {
        int[] nums = {0, 2, 1, -3};
        int target = 1;
        int expected = 0;

        int actual = solution.threeSumClosest(nums, target);

        assert actual == expected;
    }

    @Test
    public void case3() {
        int[] nums = {1,1,1,0};
        int target = 100;
        int expected = 3;

        int actual = solution.threeSumClosest(nums, target);

        assert actual == expected;
    }

}
