/*
Problem: Insertion At A Given Position In A Linked List
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/insertion-at-a-given-position-in-a-linked-list/1
*/

class Solution {
    public Node insertPos(Node head, int pos, int val) {

        Node newNode = new Node(val);

        if(pos == 1){
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        for(int i = 1; i < pos - 1; i++){
            if(temp == null)
                return head;

            temp = temp.next;
        }

        if(temp == null)
            return head;

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
}