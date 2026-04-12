/*
Problem: Parenthesis Checker2744
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1
*/

class Solution {
    public boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            st.push(')');
            else if(ch == '{')
            st.push('}');
            else if(ch == '[')
            st.push(']');
            else {
                if(st.isEmpty() || st.pop()!=ch){
                return false;
            }}}
            return st.isEmpty();
            
        }
}