/*
Problem: Search In A Matrix17201720
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/search-in-a-matrix17201720/1
*/

class Solution {
    public static boolean matSearch(int mat[][], int x) {
      int rows = mat.length;
      int cols = mat[0].length;
      for(int i = 0 ; i < rows ; i ++)
      {
          for(int j = 0 ; j < cols ; j++)
          {
              if(mat[i][j] == x)
              {
                  return true;
              }
          }
      }
        return false;
    }
}