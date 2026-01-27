/*
Problem: Longest Increasing Subsequence 1587115620
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1
*/

class Solution {
    static int lis(int arr[]) {
        int n = arr.length;
        int dp [] = new int[n+1];
        int maxlen = 1;
        for(int i = 0 ; i < n; i++)
        {
            dp[i] = 1;
            for(int j = 0 ; j < i ; j++)
            {  if (arr[j] < arr[i]) {
                dp[i] = Math.max(dp[i],dp[j]+1);
            }}
            maxlen = Math.max(maxlen,dp[i]);
        }
        return maxlen;
    }
}