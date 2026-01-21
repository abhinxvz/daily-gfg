/*
Problem: Coin Change2448
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/coin-change2448/1
*/

class Solution {
    public int count(int coins[], int sum) {
        int dp[] = new int[sum + 1];
        dp[0] = 1;
        for(int coin : coins)
        {
            for(int i = 1; i <= sum; i++)
            {
                if(coin <= i)
                {
                    dp[i]+=dp[i-coin];
                }
            }
        }
        return dp[sum];
    }
}