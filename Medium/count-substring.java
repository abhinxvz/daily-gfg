/*
Problem: Count Substring
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/count-substring/1
*/

class Solution {
    public static int countSubstring(String s) {
        int lastA = -1, lastB = -1, lastC = -1;
        int count = 0;
        int n = s.length();
        for(int i = 0; i < n; i++)
        {
        char ch = s.charAt(i);
        if(ch == 'a') lastA = i;
        if(ch == 'b') lastB = i;
        if(ch == 'c') lastC = i;
        if(lastA != -1 && lastB != -1 && lastC != -1)
        {
            count+= Math.min(lastA, Math.min(lastB,lastC)) + 1;
        }
        
    }
    return count;
}
}