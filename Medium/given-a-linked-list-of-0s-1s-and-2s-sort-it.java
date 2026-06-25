/*
Problem: Given A Linked List Of 0s 1s And 2s Sort It
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
*/

}
}*/

class Solution {
    public Node segregate(Node head) {
        int zero = 0;
        int one = 0;
        int two = 0;
       Node temp = head;
       while(temp != null)
    {
        if(temp.data == 0)
        zero++;
        else if(temp.data == 1)
        one++;
        else
        two++;
        temp = temp.next;
    }
    temp = head;
    while(zero --> 0)
    {
        temp.data = 0;
        temp = temp.next;
    }
    while(one --> 0)
    {
        temp.data = 1;
        temp = temp.next;
    }
    while(two --> 0)
    {
        temp.data = 2;
        temp = temp.next;
    }
    return head;
    }
}