/*
Problem: Next Permutation5226
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/next-permutation5226/1
*/

{
            if(arr[i] < arr[i+1])
            {
                index = i;
                break;
            }
        }
        
        if(index == -1)
        {
            reverse(arr, 0 , n-1);
            return;
        }
        
        for(int i = n - 1; n > index; i--)
        {
            if(arr[i] > arr[index])
            {
                swap(arr,i,index);
                break;
            }
        }
        
        reverse(arr,index + 1, n-1);
    }
    
    private void reverse(int arr[], int l, int r)
    {
        while(l < r)
        {
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    
    private void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}