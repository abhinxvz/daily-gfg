/*
Problem:  Minimum Number Of Coins4426
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
*/

class Solution {
    public int findMin(int n) {
        int arr[] = {1,2,5,10};
        int count = 0;
        for(int i = arr.length - 1; i >= 0; i--)
        {
            if(arr[i] <= n)
            {
                count += n/arr[i];
                n = n % arr[i];
            }
        }
        return count;
    }
}