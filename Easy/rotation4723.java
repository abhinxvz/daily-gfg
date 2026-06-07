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
        int index = -1;
        int ans = Integer.MAX_VALUE;
        while(left <= right)
        {
            int mid = left + (right - left) / 2;
            if(arr[left] <= arr[mid])
            {
                if(arr[left] < ans)
                {   
                    index = left;
                    ans = arr[left];
                }
                left = mid + 1;
            }
            else {
                
                if(arr[mid] < arr[right])
                {   
                    index = mid;
                    ans = arr[mid];
                }
                right = mid - 1;
            }
        }
        return index;
        
    }
}