/*
Problem: Maximum Product Subarray3604
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1
*/

class Solution {
    int maxProduct(int[] arr) {
        int max_prod = arr[0];
        int min_prod = arr[0];
        int n = arr.length;
        int ans = arr[0];
        for(int i = 1 ; i < arr.length; i++)
        {
            int x = arr[i];
            if(x < 0) {
            int temp = min_prod;
            min_prod = max_prod;
            max_prod = temp;
        }
        max_prod = Math.max(x,max_prod*x);
        min_prod = Math.min(x,min_prod*x);
        ans = Math.max(ans,max_prod);
        
    }
    return ans; 
}
}