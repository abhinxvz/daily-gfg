/*
Problem: Number Of Occurrence2259
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
*/

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
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return first;
    }
    
int countFreq(int[] arr, int target)  {
        
            int first = firstof(arr,target);
            if (first == -1) {
            return 0;
            
        }
        int last = lastof(arr, target);
            
            return last - first + 1;