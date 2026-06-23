/*
Problem: Reverse A Linked List
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1
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
    Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while(curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
    }
}