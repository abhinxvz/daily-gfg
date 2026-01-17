/*
Problem: Smallest Subarray With Sum Greater Than X5651
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1
*/

// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        int sum = 0;
        int mini = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int n = arr.length;
        for(right = 0; right < n; right++)
        {
            sum = sum + arr[right];
        while(sum > x)
        {
            
            mini = Math.min(mini, right - left + 1);
            sum-= arr[left];
            left++;
        }}
        return (mini == Integer.MAX_VALUE) ? 0 : mini;
    }
}