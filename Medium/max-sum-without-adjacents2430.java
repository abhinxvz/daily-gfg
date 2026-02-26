/*
Problem: Max Sum Without Adjacents2430
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/max-sum-without-adjacents2430/1
*/

class Solution {
    public int findMaxSum(int[] arr) {
      int n = arr.length;
      if( n == 0)
      return 0;
      if(n == 1)
      return arr[0];
      int dp[] = new int[n];
      dp[0] = arr[0];
      dp[1] = Math.max(arr[0], arr[1]);
      for(int i = 2; i <n ; i++)
      {
          int include = arr[i] + dp[i-2];
          int exclude = dp[i-1];
          dp[i] = Math.max(include,exclude);
      }
      return dp[n-1];
}}