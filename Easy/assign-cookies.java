/*
Problem: Assign Cookies
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/assign-cookies/1
*/

class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
          Arrays.sort(greed);
          Arrays.sort(cookie);
          
          int i = 0, j = 0;
          
          while( i < greed.length && j < cookie.length)
          {
             if(cookie[j] >= greed[i])
             {
                 i++;
             }
             j++;
          }
          return i;
    }
}