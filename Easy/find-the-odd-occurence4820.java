/*
Problem: Find The Odd Occurence4820
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/find-the-odd-occurence4820/1
*/

class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        int n = arr.length;
        int res = 0;
        for(int i = 0; i < n; i++)
        {
            res ^= arr[i];
        }
        return res;

    }
}