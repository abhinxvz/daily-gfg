/*
Problem: Outermost Parentheses
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/outermost-parentheses/1
*/

class Solution {
    public static String removeOuter(String s) {
       StringBuilder s1 = new StringBuilder();
       int opened = 0;
       for(char c : s.toCharArray())
       {
           if(c == '(')
           {
               if(opened > 0)
               {
                   s1.append(c);
               }
               opened++;
           }
           else {
               opened--;
           if(opened > 0)
           {
               s1.append(c);
           }
           }
       }
       return s1.toString();
       
        
    }
}