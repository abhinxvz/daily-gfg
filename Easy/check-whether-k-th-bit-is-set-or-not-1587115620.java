/*
Problem: Check Whether K Th Bit Is Set Or Not 1587115620
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1
*/

class CheckBit {
    static boolean checkKthBit(int n, int k) {
        
        return (n & (1 << k)) != 0;


    }
}