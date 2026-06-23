/*
Problem: Finding Middle Element In A Linked List
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
*/

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}