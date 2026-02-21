/*
Problem: Peak Element
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/peak-element/1
*/

class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left < right)
        {
            int mid = left + (right - left) / 2;
            if(arr[mid] > arr[mid+1])
            {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
        
        
    }
}