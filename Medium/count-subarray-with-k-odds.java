/*
Problem: Count Subarray With K Odds
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/count-subarray-with-k-odds/1
*/

class Solution {
     private int atmost(int arr[], int target)
    {
        int n = arr.length;
        int sum = 0;
        int r = 0, l = 0;
        int cnt = 0;
        if(target < 0)
        return 0;
        while(r < n)
        {
            sum += arr[r]%2;
            while(sum > target)
            {
                sum-= arr[l]%2;
                l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;
    }
    public int countSubarrays(int[] arr, int k) {
      
     return atmost(arr, k) - atmost(arr, k - 1);
    }
}