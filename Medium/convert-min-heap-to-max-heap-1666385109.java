/*
Problem: Convert Min Heap To Max Heap 1666385109
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/convert-min-heap-to-max-heap-1666385109/1
*/

class Solution {
    static void convertMinToMaxHeap(int N, int arr[]) {
        for (int i = N - 1; i >= 0; i--) {
            heapify(arr, N, i);
        }
    }

    static void heapify(int arr[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest]) largest = l;
        if (r < N && arr[r] > arr[largest]) largest = r;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, N, largest);
        }
    }
}