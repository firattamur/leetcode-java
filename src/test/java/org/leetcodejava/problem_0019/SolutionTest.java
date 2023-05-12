package org.leetcodejava.problem_0019;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void case1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));

        ListNode actual = solution.removeNthFromEnd(head, n);

        assert equals(actual, expected);
    }

    @Test
    public void case2() {
        ListNode head = new ListNode(1);
        int n = 1;
        ListNode expected = null;

        ListNode actual = solution.removeNthFromEnd(head, n);

        assert equals(actual, expected);
    }

    @Test
    public void case3() {
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 1;
        ListNode expected = new ListNode(1);

        ListNode actual = solution.removeNthFromEnd(head, n);

        assert equals(actual, expected);
    }

    private static boolean equals(ListNode node1, ListNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        return node1.val == node2.val && equals(node1.next, node2.next);
    }

}
