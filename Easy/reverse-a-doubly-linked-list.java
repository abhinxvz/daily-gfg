/*
Problem: Reverse A Doubly Linked List
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
*/

/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        Node curr = head;
        Node temp = null;
        while(curr!=null)
        {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev; 
        }
        if(temp!=null)
        {
            head = temp.prev;
        }
        return head;
        
    }
}