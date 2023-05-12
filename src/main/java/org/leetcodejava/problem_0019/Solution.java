package org.leetcodejava.problem_0019;

/*

    Problem 19: Remove Nth Node From End of List

    Given the head of a linked list, remove the nth node from the end of the list and return its head.

    Example 1:

    Input: head = [1,2,3,4,5], n = 2
    Output: [1,2,3,5]
    Example 2:

    Input: head = [1], n = 1
    Output: []
    Example 3:

    Input: head = [1,2], n = 1
    Output: [1]


    Constraints:

    The number of nodes in the list is sz.
    1 <= sz <= 30
    0 <= Node.val <= 100
    1 <= n <= sz


    Follow up: Could you do this in one pass?

 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode currentNode = head;
        ListNode removedNode = head;

        for (int i = 0; i < n; i++) {
            currentNode = currentNode.next;
        }

        if (currentNode == null) {
            return head.next;
        }

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            removedNode = removedNode.next;
        }

        removedNode.next = removedNode.next.next;

        return head;

    }



}
