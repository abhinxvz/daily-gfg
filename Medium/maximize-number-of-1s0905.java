/*
Problem: Maximize Number Of 1s0905
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/maximize-number-of-1s0905/1
*/

class Solution {
    public int maxOnes(int arr[], int k) 
    {
        int left = 0;
        int zeroes = 0;
        int maxi = 0;
        for(int right = 0; right < arr.length; right++)
        {
            if(arr[right] == 0)
            {
                zeroes++;
            }
            while( zeroes > k)
            {
                if(arr[left] == 0)
                {
                    zeroes--;
                }
                left++;
            }
            maxi = Math.max(maxi, right - left + 1);
        }
    return maxi;
    }
}