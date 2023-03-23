package org.leetcodejava.problem_0002;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void case1() {
        ListNode l1 = arrayToNodeList(new int[]{2, 4, 3});
        ListNode l2 = arrayToNodeList(new int[]{5, 6, 4});
        int[] expected = {7, 0, 8};

        ListNode actual = solution.addTwoNumbers(l1, l2);

        assertArrayEquals(expected, nodeListToArray(actual));
    }

    @Test
    public void case2() {
        ListNode l1 = arrayToNodeList(new int[]{0});
        ListNode l2 = arrayToNodeList(new int[]{0});
        int[] expected = {0};

        ListNode actual = solution.addTwoNumbers(l1, l2);

        assertArrayEquals(expected, nodeListToArray(actual));
    }

    @Test
    public void case3() {
        ListNode l1 = arrayToNodeList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = arrayToNodeList(new int[]{9, 9, 9, 9});
        int[] expected = {8, 9, 9, 9, 0, 0, 0, 1};

        ListNode actual = solution.addTwoNumbers(l1, l2);

        assertArrayEquals(expected, nodeListToArray(actual));
    }

    ListNode arrayToNodeList(int[] array) {
        /*
            Convert an array to a linked list.

            param array: The array to convert.
            :return: The head of the linked list.
        */

        ListNode head       = null;
        ListNode current    = head;

        for (int i : array) {

            if (head == null) {
                head = new ListNode(i);
                current = head;
            } else {
                current.next = new ListNode(i);
                current = current.next;
            }

        }

        return head;

    }

    int[] nodeListToArray(ListNode list) {
        /*
            Convert a linked list to an array.

            param list: The linked list to convert.
            :return: The array.
         */

        int length = 0;
        ListNode current = list;
        while (current != null) {
            length++;
            current = current.next;
        }

        int[] array = new int[length];
        int i = 0;

        while (list != null) {
            array[i] = list.val;
            list = list.next;
            i++;
        }

        return array;

    }

}
