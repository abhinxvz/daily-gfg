/*
Problem: Largest Subarray With 0 Sum
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1
*/

class Solution {
    int maxLength(int arr[]) {
        int n = arr.length;
        int maxlen = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
        
        
        if(sum == 0)
        maxlen = i + 1;
        
        if(map.containsKey(sum))
        {
            maxlen = Math.max(maxlen, i - map.get(sum));
        }
        else {
            map.put(sum, i);
        }
        }
        
        return maxlen;
    }
}