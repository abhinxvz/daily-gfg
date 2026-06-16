/*
Problem: Next Larger Element 1587115620
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1
*/

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        int nge[] = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i >= 0; i--)
        {
            while(!st.isEmpty() && st.peek() <= arr[i])
            {
                st.pop();
            }
                if(st.isEmpty()) 
                {
                    nge[i] = -1;
                }
                else {
                    nge[i] = st.peek();
                    
                }
                st.push(arr[i]);


   
                }
            
            ArrayList<Integer> ans = new ArrayList<>();
            for(int x : nge)
            {
                ans.add(x);
            }
            return ans;
        }

        
    }