/*
Problem: Stock Span Problem 1587115621
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
*/

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {

        int n = arr.length;
        int[] span = new int[n];
        
        Stack<Integer> st = new Stack<>();
                for (int i = 0; i < n; i++) {

        
        while(!st.isEmpty() && arr[st.peek()] <= arr[i])
        {
            st.pop();
        }
        
        if(st.isEmpty())
        span[i] = i + 1;
        else 
        span[i] = i - st.peek();
        
        st.push(i);
                }
                
                ArrayList<Integer> arrr = new ArrayList<>();
                for(int x : span)
                {
                    arrr.add(x);
                }
                return arrr;
    }}