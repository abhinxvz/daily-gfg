/*
Problem: Find Missing And Repeating2512
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
*/

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        int n = arr.length;
        
        int freq[] = new int[n+1];
        
        for(int i = 0; i < n; i++)
        {
            freq[arr[i]]++;
        }
        int missing = -1;
        int repeating = -1;
        
        for(int i = 1; i <= n; i++)
        {
            if(freq[i] == 0)
            missing = i;
            if(freq[i] == 2)
            repeating = i;
            
        }
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(repeating);
        ans.add(missing);
        
        return ans;
    }
}