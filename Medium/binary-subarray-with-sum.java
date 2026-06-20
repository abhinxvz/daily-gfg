/*
Problem: Binary Subarray With Sum
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/binary-subarray-with-sum/1
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
            sum += arr[r];
            while(sum > target)
            {
                sum-= arr[l];
                l++;
            }
            cnt += (r-l+1);
            r++;
        }
        return cnt;
    }
    public int numberOfSubarrays(int[] arr, int target) {
        return atmost(arr,target) - atmost(arr,target-1);
        
    }
}