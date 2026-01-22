/*
Problem: Shortest Common Supersequence0322
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/shortest-common-supersequence0322/1
*/

class Solution {
    public static int minSuperSeq(String s1, String s2) {
    int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 1 ; i <= n; i++)
        {
            dp[i][0] = i;
            
            for(int j = 1 ; j <= m; j++)
            {
                dp[0][j] = j;
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] =1 + Math.min(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
        
    }
}