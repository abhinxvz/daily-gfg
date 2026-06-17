/*
Problem: Number Of Nges To The Right
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/number-of-nges-to-the-right/1
*/

class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {

        int q = indices.length;
        int n = arr.length;

        int[] ans = new int[q];

        for (int i = 0; i < q; i++) {

            int idx = indices[i];
            int count = 0;

            for (int j = idx + 1; j < n; j++) {
                if (arr[j] > arr[idx]) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}