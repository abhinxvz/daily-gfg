/*
Problem: Find Length Of Loop
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/find-length-of-loop/1
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
    public int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
        if(slow == fast)
        {
            int count = 1;
            fast = fast.next;
            
            while(slow != fast)
            {
                count++;
                fast = fast.next;
            }
            return count;
        }}
        return 0;
    }
}