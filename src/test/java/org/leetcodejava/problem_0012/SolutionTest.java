package org.leetcodejava.problem_0012;

import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        int num = 3;
        String expected = "III";

        String actual = solution.intToRoman(num);

        assert actual.equals(expected);
    }

    @Test
    public void case2() {
        int num = 4;
        String expected = "IV";

        String actual = solution.intToRoman(num);

        assert actual.equals(expected);
    }

    @Test
    public void case3() {
        int num = 9;
        String expected = "IX";

        String actual = solution.intToRoman(num);

        assert actual.equals(expected);
    }

    @Test
    public void case4() {
        int num = 58;
        String expected = "LVIII";

        String actual = solution.intToRoman(num);

        assert actual.equals(expected);
    }

    @Test
    public void case5() {
        int num = 1994;
        String expected = "MCMXCIV";

        String actual = solution.intToRoman(num);

        assert actual.equals(expected);
    }

}
