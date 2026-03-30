/*
Problem: Isomorphic Strings 1587115620
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1
*/

class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        int m1[] = new int[256];
        int m2[] = new int[256];
        int n = s1.length();
        for(int i = 0; i < n;i++)
        {
            char c = s1.charAt(i);
            char c1 = s2.charAt(i);
            if(m1[c] != m2[c1])
            {
                return false;
            }
                m1[c] = i + 1;
                m2[c1] = i + 1;
            
           
        }
         return true;
        
    }
}