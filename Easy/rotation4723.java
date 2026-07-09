/*
Problem: Rotation4723
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/rotation4723/1
*/

class Solution {
    public int findKRotation(int arr[]) {
         int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            
            if(arr[left] <= arr[right])
            return left;
            
            if(arr[mid] >= arr[right])
            left = mid + 1;
            
            else 
            
            right = mid;
        }
         
         return left;
    }}