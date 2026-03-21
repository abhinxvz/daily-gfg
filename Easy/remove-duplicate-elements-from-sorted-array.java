/*
Problem: Remove Duplicate Elements From Sorted Array
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
*/

class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> any = new ArrayList<>();
        any.add(arr[0]);
        int n = arr.length;
        for(int i = 1; i < n; i++)
        {
            if(arr[i]!=arr[i-1])
            {
                any.add(arr[i]);
            }
        }
        
        return any;
    }
}