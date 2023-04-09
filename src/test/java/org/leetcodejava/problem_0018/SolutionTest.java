package org.leetcodejava.problem_0018;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void case1() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> expected = List.of(
                List.of(-2, -1, 1, 2),
                List.of(-2,  0, 0, 2),
                List.of(-1,  0, 0, 1)
        );

        List<List<Integer>> actual = solution.fourSum(nums, target);

        assertIfListsNotEqual(actual, expected);
    }

    @Test
    public void case2() {
        int[] nums = {2, 2, 2, 2, 2};
        int target = 8;
        List<List<Integer>> expected = List.of(
                List.of(2, 2, 2, 2)
        );

        List<List<Integer>> actual = solution.fourSum(nums, target);

        assertIfListsNotEqual(actual, expected);
    }

    @Test
    public void case3() {
        int[] nums = {0, 0, 0, 0};
        int target = 0;
        List<List<Integer>> expected = List.of(
                List.of(0, 0, 0, 0)
        );

        List<List<Integer>> actual = solution.fourSum(nums, target);

        assertIfListsNotEqual(actual, expected);
    }

    @Test
    public void case4() {
        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
        int target = -294967296;
        List<List<Integer>> expected = List.of();

        List<List<Integer>> actual = solution.fourSum(nums, target);

        assertIfListsNotEqual(actual, expected);
    }

    private void assertIfListsNotEqual(List<List<Integer>> actual, List<List<Integer>> expected) {

        if (actual.size() != expected.size()) {
            throw new AssertionError("Lists are not equal");
        }

        for (int i = 0; i < actual.size(); i++) {
            List<Integer> actualList   = actual.get(i);
            List<Integer> expectedList = expected.get(i);

            if (actualList.size() != expectedList.size()) {
                throw new AssertionError("Lists are not equal");
            }

            for (int j = 0; j < actualList.size(); j++) {
                if (actualList.get(j) != expectedList.get(j)) {
                    throw new AssertionError("Lists are not equal");
                }
            }
        }

    }

}
