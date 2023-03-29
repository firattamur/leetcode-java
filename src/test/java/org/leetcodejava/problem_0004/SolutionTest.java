package org.leetcodejava.problem_0004;

import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expected = 2.0;

        double actual = solution.findMedianSortedArrays(nums1, nums2);

        assert actual == expected;
    }

    @Test
    public void case2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double expected = 2.5;

        double actual = solution.findMedianSortedArrays(nums1, nums2);

        assert actual == expected;
    }

    @Test
    public void case3() {
        int[] nums1 = {0, 0};
        int[] nums2 = {0, 0};
        double expected = 0.0;

        double actual = solution.findMedianSortedArrays(nums1, nums2);

        assert actual == expected;
    }

}
