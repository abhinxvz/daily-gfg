/*
Problem: Geek Jump
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/geek-jump/1
*/

// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int n = height.length;
        int[] dp = new int[n+1];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int jumpOne = dp[i - 1] + Math.abs(height[i] - height[i - 1]);
            int jumpTwo = Integer.MAX_VALUE;

            if (i > 1) {
                jumpTwo = dp[i - 2] + Math.abs(height[i] - height[i - 2]);
            }

            dp[i] = Math.min(jumpOne, jumpTwo);
        }

        // ✅ return true if last stone is reachable
        return dp[n - 1] ;
    }
}