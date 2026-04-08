/*
Problem: Minimum Number Of Sprinkler  170645
Difficulty: Hard
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/minimum-number-of-sprinkler--170645/1
*/

class Solution {
    public static int minSprinkler(int n, int[] arr) {
       int dp[] = new int[n+1];
       for(int i = 0; i < n; i++)
       {
           int left = Math.max(0,i-arr[i]);
           int right = Math.min(n-1,i+arr[i]);
           dp[left] = Math.max(dp[left], right);
           
       }
       int currentp = -1;
       int farthest = 0;
       int fountain = 0;
      
       for(int i = 0; i < n; i++)
       {
            farthest = Math.max(farthest,dp[i]);
           if(i > farthest)
               return -1;
           if(i > currentp)
           {
              
               currentp = farthest;
                fountain++;
           }
           
       }
       return fountain;
        
    }
}