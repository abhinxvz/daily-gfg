/*
Problem: Subsets 1613027340
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/subsets-1613027340/1
*/

class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        int n = arr.length;
        int subset = 1 << n;
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         for(int i = 0; i < subset; i++)
         {
             ArrayList<Integer> sub = new ArrayList<>();
            for(int j = 0; j < n; j++)
            {
             if((i & (1 << j)) != 0)
             {
                 sub.add(arr[j]);
             }
         }
         ans.add(sub);
         }
         return ans;
        
        
        
    }
}