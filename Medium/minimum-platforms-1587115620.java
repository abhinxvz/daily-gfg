/*
Problem: Minimum Platforms 1587115620
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
*/

class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 0;
        int max_count = Integer.MIN_VALUE;
        int n = arr.length;
        
        int i = 0;
        int j = 0;
        while(i < n)
        {
            if(arr[i] <= dep[j] )
            {
                i++;
                count++;
            }
            else {
                count--;
                j++;
            }
        
        max_count = Math.max(max_count, count);
        }
        return max_count;
        
    }
}