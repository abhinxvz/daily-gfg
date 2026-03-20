/*
Problem: Count Subarray With K Odds
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/count-subarray-with-k-odds/1
*/

class Solution {
    public int countSubarrays(int[] arr, int k) {
        return atmost(arr,k) - atmost(arr,k-1);
    }
    public int atmost(int[] arr, int k)
    {
        int left = 0;
        int count = 0;
        int odd_c = 0;
        for(int right = 0; right < arr.length; right++)
        {
            if(arr[right] % 2 != 0)
            {
                odd_c++;
            }
            while(odd_c > k)
            {
                if(arr[left] % 2 != 0)
                {
                    odd_c--;
                }
                left++;
            }
            count+=(right-left+1);
        }
        
        return count;
    }
}