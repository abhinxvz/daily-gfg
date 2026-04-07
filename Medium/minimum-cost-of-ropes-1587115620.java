/*
Problem: Minimum Cost Of Ropes 1587115620
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
*/

class Solution {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int value : arr)
        {
            pq.add(value);
        }
        int totalcost = 0;
        while(pq.size() > 1)
        {
            int left = pq.poll();
            int right = pq.poll();
            int merged = left + right;
            totalcost += merged;
            pq.add(merged);
        }
        return totalcost;
    }
}