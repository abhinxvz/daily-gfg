/*
Problem: Trapping Rain Water 1587115621
Difficulty: Hard
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
*/

class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int total = 0 , rightmax = 0, leftmax = 0;
        while(l < r)
        {
            if(arr[r] >= arr[l])
            {
                if(leftmax > arr[l])
                {
                    total += leftmax - arr[l];
                }
                else {
                    leftmax = arr[l];
                }
                l++;
            }
            else {
                if(rightmax > arr[r])
                {
                    total += rightmax - arr[r];
                }
                else {
                    rightmax = arr[r];
                }
                r--;
            }
        }
        return total;

    }
}