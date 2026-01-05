/*
Problem: Flattening A Linked List
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/flattening-a-linked-list/1
*/

class Solution {

    Node flatten(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        head.next = flatten(head.next);

        head = merge(head, head.next);

        return head;
    }

    Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;

        if (a.data <= b.data) {
            result = a;
            result.bottom = merge(a.bottom, b);
        } else {
            result = b;
            result.bottom = merge(a, b.bottom);
        }

        result.next = null;
        return result;
    }
}