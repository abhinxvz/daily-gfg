/*
Problem: Set The Rightmost Unset Bit4436
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/set-the-rightmost-unset-bit4436/1
*/

class Solution {
    public int setBit(int n) {
        n = n | (n+1);
        return n;
    }
}