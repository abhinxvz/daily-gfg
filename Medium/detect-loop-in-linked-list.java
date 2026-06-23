/*
Problem: Detect Loop In Linked List
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
*/

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        if(slow == fast)
        {
            return true;
        }}
        return false;
    }
}