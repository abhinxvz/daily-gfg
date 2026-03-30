/*
Problem: Two Numbers With Odd Occurrences5846
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/two-numbers-with-odd-occurrences5846/1
*/

class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }

        int setbits = xor & -xor;

        int num1 = 0, num2 = 0;

        for (int num : arr) {
            if ((num & setbits) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        if (num1 > num2) {
            result.add(num1);
            result.add(num2);
        } else {
            result.add(num2);
            result.add(num1);
        }

        return result;
    }
}