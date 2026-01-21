/*
Problem: Max Circular Subarray Sum 1587115620
Difficulty: Hard
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1
*/

class Solution {
    public int maxCircularSum(int arr[]) {
        int max_e = 0, max_so_far = Integer.MIN_VALUE;
        int min_e = 0, min_so_far = Integer.MAX_VALUE;
        int total = 0;
        for(int x : arr)
        {
            total+=x;
            max_e = Math.max(x, max_e+x);
            max_so_far = Math.max(max_so_far, max_e);
            min_e = Math.min(x, min_e+x);
            min_so_far = Math.min(min_so_far,min_e); 
        }
            if (max_so_far < 0) return max_so_far;

        
        return Math.max(max_so_far,total - min_so_far);
    }
}