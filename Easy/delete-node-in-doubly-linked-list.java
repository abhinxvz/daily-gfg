/*
Problem: Delete Node In Doubly Linked List
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1
*/

/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        Node curr = head;
        if (head == null) return null;

        // Edge case 2: Deleting the head node (1st position)
        if (x == 1) {
            Node newHead = head.next;
            if (newHead != null) {
                newHead.prev = null;
            }
            return newHead;
        }
        for(int i =1; i < x-1; i++)
        {
            curr = curr.next;
        }
        
        Node del = curr.next;
        
        if(del == null)
            return head;

        
        curr.next = del.next;