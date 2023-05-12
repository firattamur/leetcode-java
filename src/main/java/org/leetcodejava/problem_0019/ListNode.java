package org.leetcodejava.problem_0019;

public class ListNode {

    int val;
    ListNode next;
    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ListNode && ((ListNode) obj).val == val && ((ListNode) obj).next == next;
    }

}
