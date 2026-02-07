/*
Problem: Fractional Knapsack 1587115620
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
*/

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        Integer indices [] = new Integer [n];
        for(int i = 0 ; i < n ; i++)
        {
            indices[i] = i;
        }
        Arrays.sort(indices, (a,b) ->
        Double.compare((double) val[b] / wt[b] , (double) val[a] / wt[a]));
        double totalv = 0.0;
        for(int i = 0 ; i < n ; i++)
        {
            int index = indices[i];
            if(wt[index] <= capacity)
            {
                totalv += val[index];
                capacity -=wt[index];
            }
            else {
                totalv += ((double)val[index] / wt[index]) * capacity; 
                break;
            }
        }
        return totalv;
    }
}