/*
Problem: Shortest Job First
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/shortest-job-first/1
*/

// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        Arrays.sort(bt);
        int current = 0;
        int tot = 0;
        for( int b : bt)
        {
            tot += current;
            current += b;
        
    }
    return tot/bt.length;
}
}