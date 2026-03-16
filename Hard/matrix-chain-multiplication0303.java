/*
Problem: Matrix Chain Multiplication0303
Difficulty: Hard
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1
*/

class Solution {
    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        for(int length = 2; length < n; length++)
        {
            for(int i = 1; i < n - length + 1; i++)
            {
                int j = i + length - 1;
                dp[i][j] = Integer.MAX_VALUE;
                
                for(int k = i; k < j; k++)
                {
                    int cost = dp[i][k] + dp[k+1][j] + arr[i-1] * arr[j] * arr[k];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[1][n-1];
    }
}