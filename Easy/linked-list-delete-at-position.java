/*
Problem: Linked List Delete At Position
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/linked-list-delete-at-position/1
*/

class Solution {
    public Node deleteAtPosition(Node head, int pos) {

     if(head == null)
    {
        return null;
    }
    if(pos == 1)
    {
        return head.next;
        
    }
    Node temp = head;
    for(int i = 1; i < pos - 1; i++)
    {
        temp = temp.next;
    }
    temp.next = temp.next.next;
    return head;
    // code here
    
}}