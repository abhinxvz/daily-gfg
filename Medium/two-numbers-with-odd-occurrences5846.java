/*
Problem: Two Numbers With Odd Occurrences5846
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/two-numbers-with-odd-occurrences5846/1
*/

class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        int xor = 0;
        for(int num : arr)
        xor = xor^num;
        
        int setbits = xor & -xor;
        
        int x = 0, y = 0;
        for(int num : arr)
        {
            if((num & setbits) != 0)
            {
                x = x^num;
            }
            else {
                y = y^num;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();

        if (x > y) {
            ans.add(x);
            ans.add(y);
        } else {
            ans.add(y);
            ans.add(x);
        }

        return ans;
    }
}