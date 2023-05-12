package org.leetcodejava.problem_0017;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        String s = "23";
        List<String> expected = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");

        List<String> actual = solution.letterCombinations(s);

        assert actual.equals(expected);
    }

    @Test
    public void case2() {
        String s = "";
        List<String> expected = List.of();

        List<String> actual = solution.letterCombinations(s);

        assert actual.equals(expected);
    }

    @Test
    public void case3() {
        String s = "2";
        List<String> expected = List.of("a","b","c");

        List<String> actual = solution.letterCombinations(s);

        assert actual.equals(expected);
    }

}
