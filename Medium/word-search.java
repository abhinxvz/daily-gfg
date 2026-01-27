/*
Problem: Word Search
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/word-search/1
*/

class Solution {
    public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;
        for(int i = 0; i < n ; i++)
        {
            for(int j = 0; j< m; j++)
            {
                if(mat[i][j]==word.charAt(0))
                {
                    if(dfs(mat,word,i,j,0))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
     private boolean dfs(char[][] mat, String word, int row, int col, int index) {
        if (index == word.length()) return true;

        if (row < 0 || col < 0 || row >= mat.length || col >= mat[0].length)
            return false;

        if (mat[row][col] != word.charAt(index))
            return false;

        char temp = mat[row][col];
        mat[row][col] = '#';

        boolean found =
                dfs(mat, word, row + 1, col, index + 1) ||
                dfs(mat, word, row - 1, col, index + 1) ||
                dfs(mat, word, row, col + 1, index + 1) ||
                dfs(mat, word, row, col - 1, index + 1);

        mat[row][col] = temp;