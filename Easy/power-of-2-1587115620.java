/*
Problem: Power Of 2 1587115620
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/power-of-2-1587115620/1
*/

class Solution {
    public static boolean isPowerofTwo(int n) {
        return (n>0) && ((n & (n-1)) == 0);
    }
}