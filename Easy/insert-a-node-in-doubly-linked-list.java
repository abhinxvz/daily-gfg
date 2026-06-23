/*
Problem: Insert A Node In Doubly Linked List
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1
*/

/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        Node curr = head;
        
        // Reach p-th node
        for(int i = 0; i < p; i++) {
            curr = curr.next;
        }
        
        Node newNode = new Node(x);
        
        newNode.next = curr.next;
        newNode.prev = curr;
        
        if(curr.next != null) {
            curr.next.prev = newNode;
        }
        
        curr.next = newNode;
        
        return head;
    }
}