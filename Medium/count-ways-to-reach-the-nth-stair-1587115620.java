/*
Problem: Count Ways To Reach The Nth Stair 1587115620
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/count-ways-to-reach-the-nth-stair-1587115620/1
*/

class Solution {
    int countWays(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

        
    }
}