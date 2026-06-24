/*
Problem: Check If Linked List Is Pallindrome
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
*/

Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
       Node slow = head;
       Node fast = head;
       while(fast != null && fast.next != null)
       {
           slow = slow.next;
           fast = fast.next.next;
       }
       Node prev = null;
       Node curr = slow;
       while(curr!=null)
       {
           Node next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       Node first = head;
       Node second = prev;
       while(second != null)
       {
           if(first.data != second.data)
           return false;
           first = first.next;
           second = second.next;
       }
       
        return true;
    }
}