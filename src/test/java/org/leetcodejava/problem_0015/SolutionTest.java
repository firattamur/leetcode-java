package org.leetcodejava.problem_0015;

import org.junit.Test;
import org.leetcodejava.problem_0015.Solution;

import java.util.List;
import java.util.Objects;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));

        List<List<Integer>> actual = solution.threeSum(nums);

        assertListEquals(expected, actual);
    }

    @Test
    public void case2() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> expected = List.of();

        List<List<Integer>> actual = solution.threeSum(nums);

        assertListEquals(expected, actual);
    }

    @Test
    public void case3() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = List.of(List.of(0, 0, 0));

        List<List<Integer>> actual = solution.threeSum(nums);

        assertListEquals(expected, actual);
    }

    private void assertListEquals(List<List<Integer>> expected, List<List<Integer>> actual) {

        assert expected.size() == actual.size();

        for (int i = 0; i < expected.size(); i++) {
            assert expected.get(i).size() == actual.get(i).size();

            for (int j = 0; j < expected.get(i).size(); j++) {
                assert Objects.equals(expected.get(i).get(j), actual.get(i).get(j));
            }

        }

    }

}
