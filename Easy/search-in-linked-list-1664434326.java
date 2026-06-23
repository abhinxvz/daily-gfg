/*
Problem: Search In Linked List 1664434326
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1
*/

/*
  class Node {
   int data;
    Node next;

    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    public boolean searchKey(Node head, int key) {
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == key)
            {
                return true;
               
            }
             temp = temp.next;
            
        }
        return false;
        
    }
}