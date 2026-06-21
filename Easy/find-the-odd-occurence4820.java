/*
Problem: Find The Odd Occurence4820
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/find-the-odd-occurence4820/1
*/

class Solution {
    public int getOddOccurrence(int[] arr) {
        int xor = 0;

        for (int num : arr) {
            xor ^= num;
        }

        return xor;
    }
}