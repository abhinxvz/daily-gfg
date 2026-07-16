/*
Problem: Reverse An Array
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/reverse-an-array/1
*/

class Solution {
    public void reverseArray(int arr[]) {
        
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
    }
}