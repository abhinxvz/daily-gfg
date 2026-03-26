/*
Problem: Single Number1014
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/single-number1014/1
*/

// User function Template for Java

class Solution {
    int getSingle(int arr[]) {
       
        int XOR = 0;
        for(int i = 0; i < arr.length; i++)
        {
            XOR = XOR ^ arr[i];
        }
        return XOR;
    }
}