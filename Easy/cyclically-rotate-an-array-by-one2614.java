/*
Problem: Cyclically Rotate An Array By One2614
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
*/

// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        int n = arr.length;
        if(n<=1) return;
        int lastelement = arr[n-1];
        for(int i = n - 1; i > 0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = lastelement;

    }
}