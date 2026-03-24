/*
Problem: Kth Smallest Element5635
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1
*/

class Solution {
    public int kthSmallest(int[] arr, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int nums : arr)
       {
           pq.add(nums);
       
       if(pq.size() > k)
       {
           pq.poll();
       }}
       return pq.peek();
       
        
    }
}