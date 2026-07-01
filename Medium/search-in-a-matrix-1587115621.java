/*
Problem: Search In A Matrix 1587115621
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/search-in-a-matrix-1587115621/1
*/

class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
      int m = mat.length;
      int n = mat[0].length;
      int left = 0;
      int right = m * n - 1;
      while(left <= right)
      {
          
          int mid = (left + right) / 2;
          int val = mat[mid/n][mid%n];
          if(val == x)
          {
              return true;
          }
          else if(val <= x)
          {
              left = mid + 1;
          }
          else {
              right = mid - 1;
          }
      }
      return false;
    }
}