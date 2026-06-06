/*
Problem: First And Last Occurrences Of X3116
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
*/

class Solution {
    static int lastof(int arr[], int x)
    {
        int n = arr.length;
        int last = -1;
        int left = 0, right = n - 1;
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            if(x == arr[mid])
            {
                last = mid;
                left = mid + 1;
            }
            else if(x < arr[mid])
            {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return last;
    }
    static int firstof(int arr[], int x)
    {
        int n = arr.length;
        int first = -1;
        int left = 0, right = n - 1;
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            if(x == arr[mid])
            {
                first = mid;
                right = mid - 1;
            }
            else if(x < arr[mid])
            {