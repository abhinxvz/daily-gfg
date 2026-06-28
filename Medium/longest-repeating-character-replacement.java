/*
Problem: Longest Repeating Character Replacement
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/longest-repeating-character-replacement/1
*/

class Solution {
    public int longestSubstr(String s, int k) {
        int n = s.length();
        int left = 0;
        int maxcharc = 0;
        int max_l = 0;
        
        int char_c [] = new int[26];
        for(int right = 0; right < n; right++)
        {
            char c = s.charAt(right);
            
            char_c[s.charAt(right) - 'A']++;
            maxcharc = Math.max(maxcharc,char_c[s.charAt(right) - 'A']);
            
            int windows =right - left + 1;
            
            if(windows - maxcharc > k)
            {
                char remove = s.charAt(left);
                
                char_c[remove - 'A']--;
                
                left++;
            }
            max_l = Math.max(max_l, right - left + 1);
        }
        return max_l;
        
    }
}