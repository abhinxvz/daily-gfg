/*
Problem: Find Xor Of Numbers From L To R
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/find-xor-of-numbers-from-l-to-r/1
*/

// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {
        return uptore(r) ^ uptore(l-1);
    }
    public static int uptore(int number)
    {
        if(number % 4 == 0) return number;
        if(number % 4 == 1) return 1;
        if(number % 4 == 2) return number + 1;
        return 0;
}}