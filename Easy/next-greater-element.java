/*
Problem: Next Greater Element
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/next-greater-element/1
*/

class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
       int n = arr.length;
       Stack <Integer> st = new Stack<>();
       int nge[] = new int[n];
       for(int i = 2*n-1; i >= 0; i--)
       {
           while(!st.isEmpty() && st.peek() <= arr[i%n])
           {
               st.pop();
           }
           if(i < n)
           {
               nge[i] = st.isEmpty() ? -1 : st.peek();
               
           }
           st.push(arr[i%n]);
       }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x : nge)
        {
            ans.add(x);
        }
return ans;
        
    }
}