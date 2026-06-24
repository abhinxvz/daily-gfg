/*
Problem: Find The First Node Of Loop In Linked List  170645
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/find-the-first-node-of-loop-in-linked-list--170645/1
*/

/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
         Node slow = head;
         Node fast = head;
         while(fast != null && fast.next!= null)
         {
             slow = slow.next;
             fast = fast.next.next;
         if(slow == fast)
         {
             slow = head;
         while(slow != fast)
         {
             slow = slow.next;
             fast = fast.next;
         }
         return slow.data;
    }
}
return -1;
}}