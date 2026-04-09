/*
Problem: Rotate Array By N Elements 1587115621
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
*/

class Solution {
    static void rotateArr(int arr[], int d) {
    int n = arr.length;
       d = d % n;
       int result[] = new int[n];
       for(int i = 0; i < n; i++)
       {
           result[i] = arr[(i+d)%n];
       }
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
    }
}}