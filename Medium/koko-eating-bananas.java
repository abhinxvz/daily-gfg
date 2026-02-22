/*
Problem: Koko Eating Bananas
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/koko-eating-bananas/1
*/

class Solution {
    public int kokoEat(int[] arr, int k) {
        int high = 0;
        int low = 1;
        for(int a : arr)
        {
            high = Math.max(high,a);
        }
        while(low < high)
        {
            int mid = low + (high - low ) / 2;
            long hours = 0;
            for(int a : arr)
            {
                hours+= (a + mid - 1)/mid;
            }
            if(hours<=k)
            {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}