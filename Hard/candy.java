/*
Problem: Candy
Difficulty: Hard
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/candy/1
*/

class Solution {
    public int minCandy(int arr[]) {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        int sum = 0;
        for(int i = 1 ; i <= n-1; i++)
        {
            if(arr[i] > arr[i-1])
            {
                left[i] = 1 + left[i-1]; 
            }
            else {
                left[i] = 1;
                
            }
        }
        for(int i = n-2 ; i >= 0; i--)
        {
            if(arr[i] > arr[i+1])
            {
                right[i] = 1 + right[i+1];
                
            }
            else {
                right[i] = 1;
            }
        }
        for(int i = 0; i < n; i++)
        {
        sum+= Math.max(left[i],right[i]);
        }
        return sum;
        
    }
}