/*
Problem: Allocate Minimum Number Of Pages0937
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
*/

class Solution {
    public int findPages(int[] arr, int k) {
        int n = arr.length;
        if(k > n)
        return -1;
        int low = 0, high = 0;
        for(int pages : arr)
        {
          low = Math.max(low,pages);
          high += pages;
          
        }
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            int students = 1;
            int studentpage = 0;
            for(int i = 0 ; i < n ; i++)
            { 
                if(studentpage + arr[i] <= mid)
                {
                    studentpage += arr[i];
                }
                else { 
                    students++;
                    studentpage = arr[i];
        }}
        
        if( students > k)
        {
            low = mid + 1;
            
        }
        else {
            high = mid - 1;
        }
        }
        return low;
    }