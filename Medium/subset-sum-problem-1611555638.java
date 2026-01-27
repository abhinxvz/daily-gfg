/*
Problem: Subset Sum Problem 1611555638
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1
*/

class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
      int n = arr.length;
      boolean dp[] = new boolean[sum+1];
      dp[0] = true;
      for(int i = 0 ; i < n ; i++)
      {
          for(int j = sum ; j >=arr[i]; j--)
          {
              dp[j] = dp[j] || dp[j - arr[i]];
          }
      }
      return dp[sum];
    }
}