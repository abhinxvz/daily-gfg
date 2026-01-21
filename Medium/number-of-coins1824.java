/*
Problem: Number Of Coins1824
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/number-of-coins1824/1
*/

class Solution {

    public int minCoins(int coins[], int sum) {
        if(sum < 1)
        return 0;
        int minD[] = new int[sum + 1];
        for(int i = 1; i <= sum ; i++)
        {
            minD[i] = Integer.MAX_VALUE;
            for(int coin : coins)
            {
                if(coin <= i && minD[i-coin]!=Integer.MAX_VALUE)
                minD[i] = Math.min(minD[i], 1+minD[i-coin]);
                
                
            }
        }
        if(minD[sum]==Integer.MAX_VALUE)
        return -1;
        return minD[sum];
        
    }
}