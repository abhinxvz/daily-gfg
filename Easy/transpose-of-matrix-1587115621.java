/*
Problem: Transpose Of Matrix 1587115621
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1
*/

class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int j = 0; j < n; j++)
        {
            ArrayList<Integer> row = new ArrayList<>();
            for(int i = 0 ; i < m; i++)
            {
                row.add(mat[i][j]);
            }
            res.add(row);
        }
        return res;

    }
}