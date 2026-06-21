/*
Problem: Swap The Numbers
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/swap-the-numbers/1
*/

class Solution {
    public void swap(int a, int b) {
       a = a ^ b;
       b = a ^ b;
       a = a ^ b;
        

        System.out.println(a + " " + b);
    }
}