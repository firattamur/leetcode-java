package org.leetcodejava.problem_0001;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        int[] actual = solution.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void case2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};

        int[] actual = solution.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void case3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};

        int[] actual = solution.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

}
