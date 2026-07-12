/*
Problem: Delete All Occurrences Of A Given Key In A Doubly Linked List
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/1
*/

/* Structure of Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        Node curr = head;
        while(curr != null)
        {
            if(curr.data == x)
            {
            if(curr == head)
            {
              head = head.next;
            }
            
            if(curr.next != null)
            {
                curr.next.prev = curr.prev;
            }
            
            if(curr.prev != null)
            {
                curr.prev.next = curr.next;
            }
        }
        
                    curr = curr.next;

        
    }
    return head;
    }
}