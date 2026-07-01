/*
Problem: Koko Eating Bananas
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/koko-eating-bananas/1
*/

maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }
    
    private double maxH(int arr[], int h)
    {
        double maxhour = 0.0;
        int n = arr.length;
        for(int i = 0; i < n; i++ )
        {
            maxhour += Math.ceil((double)arr[i]/h);
        }
        return maxhour;
    }
    public int kokoEat(int[] arr, int k) 
    {
        int n = arr.length;
        int low = 0;
        int high = maximum(arr);;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            double t_hour = maxH(arr,mid);
            if(t_hour <= k)
            {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
       
    }
    
}