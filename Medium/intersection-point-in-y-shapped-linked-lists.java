/*
Problem: Intersection Point In Y Shapped Linked Lists
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
*/

/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        Node p1 = head1;
        Node p2 = head2;
        while(p1 != p2)
        {
            if(p1 == null)
            {
                p1 = head2;
            }
            else {
                p1 = p1.next;
            }
            if(p2 == null)
            {
                p2 = head1;
            }
            else {
                p2= p2.next;
            }
        }
        return p1;
    }
}