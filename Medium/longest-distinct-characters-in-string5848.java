/*
Problem: Longest Distinct Characters In String5848
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1
*/

class Solution {
    public int longestUniqueSubstr(String s) {
        int lastindex[] = new int[256];
        int left = 0;
        int mx = 0;
        Arrays.fill(lastindex,-1);
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(lastindex[c] >= left)
            {
                left = lastindex[c] + 1;
                
            }
            
                lastindex[c] = i;
    
        
        mx = Math.max(mx, i - left + 1);
        
    }
    return mx;
}}