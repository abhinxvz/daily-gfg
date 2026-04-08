/*
Problem: Leaders In An Array 1587115620
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
*/

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxelementright = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i >= 0; i--)
        {
            if(arr[i]  >= maxelementright)
            {
                result.add(arr[i]);
                maxelementright = arr[i];
            }}
            
            Collections.reverse(result);
           return result;
    }
}