/*
Problem: Product Array Puzzle4525
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1
*/

class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        ans[0] = 1;
        for(int i = 1; i < n; i++)
        {
            ans[i] = ans[i-1] * arr[i-1];
        }
        
        int suffix = 1;
        for(int i = n - 1; i >= 0; i--)
        {
            ans[i]*=suffix;
            suffix*=arr[i];
        }
        return ans;
    }
}