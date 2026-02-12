/*
Problem: Immediate Smaller Element1142
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1
*/

import java.util.*;

class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                result.add(-1);
            } else {
                result.add(stack.peek());
            }
            
            stack.push(arr[i]);
        }
        
        Collections.reverse(result);
        return result;
    }
}