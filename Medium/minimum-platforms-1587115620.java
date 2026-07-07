/*
Problem: Minimum Platforms 1587115620
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
*/

class Solution {
    public int minPlatform(int arr[], int dep[]) {
       int n = arr.length;
       Arrays.sort(arr);
       Arrays.sort(dep);
       int count = 0;
       int maxi = Integer.MIN_VALUE;
       int i = 0, j = 0;
       while( i < n)
       {
           if(arr[i] <= dep[j])
           {
               i++;
               count++;
           }
           else {
               count--;
           
               j++;
           }
       
       maxi = Math.max(maxi, count);
       }
       
       return maxi;
       
    }
}