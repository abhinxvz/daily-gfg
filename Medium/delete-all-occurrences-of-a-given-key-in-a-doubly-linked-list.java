/*
Problem: Delete All Occurrences Of A Given Key In A Doubly Linked List
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/1
*/

class Solution {
    Node deleteAllOccurOfX(Node head, int x) {

        Node curr = head;

        while(curr != null) {

            if(curr.data == x) {

                // If deleting the head
                if(curr == head) {
                    head = head.next;
                }

                // Update previous node
                if(curr.prev != null) {
                    curr.prev.next = curr.next;
                }

                // Update next node
                if(curr.next != null) {
                    curr.next.prev = curr.prev;
                }
            }

            curr = curr.next;
        }

        return head;
    }
}