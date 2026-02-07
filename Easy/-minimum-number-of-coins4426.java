/*
Problem:  Minimum Number Of Coins4426
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1
*/

class Solution {
    public int findMin(int n) {
        
        int[] coins = {10, 5, 2, 1};   // correct denominations
        int count = 0;
        
        for (int i = 0; i < coins.length; i++) {
            
            if (n >= coins[i]) {
                count += n / coins[i];
                n = n % coins[i];
            }
        }
        
        return count;
    }
}