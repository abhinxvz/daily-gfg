/*
Problem: Split An Array Into Two Equal Sum Subarrays
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/split-an-array-into-two-equal-sum-subarrays/1
*/

class Solution {
    public boolean canSplit(int arr[]) {
        int total = 0;
        for(int num : arr)
        {
            total+=num;
        }
        int prefix = 0;
        int suffix =0;
        for(int i = 0; i < arr.length; i++)
        {
            prefix+= arr[i];
            suffix = total - prefix;
            if(prefix == suffix)
            
                return true;
            }
    return false;

    }
}