package org.leetcodejava.problem_0006;

import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";

        String actual = solution.convert(s, numRows);

        assert actual.equals(expected);
    }

    @Test
    public void case2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";

        String actual = solution.convert(s, numRows);

        assert actual.equals(expected);
    }

    @Test
    public void case3() {
        String s = "A";
        int numRows = 1;
        String expected = "A";

        String actual = solution.convert(s, numRows);

        assert actual.equals(expected);
    }

}
