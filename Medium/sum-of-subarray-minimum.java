/*
Problem: Sum Of Subarray Minimum
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/sum-of-subarray-minimum/1
*/

long mod = 1000000007;

        Stack <Integer> st = new Stack<>();
        for(int i = 0; i < n; i++)
        {
            while(!st.isEmpty() && arr[st.peek()] > arr[i])
            {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
        
        st.push(i);}
        
        st.clear();
        for(int i = n-1; i >= 0; i--)
        {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
        
        st.push(i);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            ans = (ans + (left * right * arr[i]) % mod) % mod;
        }

        return (int) ans;
    }
}