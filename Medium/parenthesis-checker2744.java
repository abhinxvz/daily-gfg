/*
Problem: Parenthesis Checker2744
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
*/

class Solution {
    public boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray())
        {
            if(c == '(' || c == '{' || c == '[')
            {
                st.push(c);
            }
            else {
                
                if(st.isEmpty())
                return false;
                
                char top = st.pop();
                
                if( c == ')' && top != '(' ||  c == '}' && top != '{' || c == ']' && top != '[')
                
                    return false;
            
            }
        }
        return st.isEmpty();
    }
}