/*
Problem: Does Array Represent Heap4345
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/does-array-represent-heap4345/1
*/

// User function Template for Java

class Solution {

    public boolean countSub(long arr[], long n) {
       for(int i = 0; i <= (n/2) - 1; i++)
       {
           int l = 2*i+1;
           int r = 2*i+2;
           if(arr[i] < arr[l]) return false;
           if(r < n && arr[i] < arr[r]) return false;
       }
       return true;
       
    }
}