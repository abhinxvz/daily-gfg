/*
Problem: Activity Selection 1587115620
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/activity-selection-1587115620/1
*/

class Solution {
    public int activitySelection(int[] start, int[] finish) {
                int n = start.length;

        int meetings[][] = new int[n][3];
       
        for(int i = 0; i < n; i++)
        {
            meetings[i][0] = start[i];
            meetings[i][1] = finish[i];
            meetings[i][2] = i+1;
        }
        Arrays.sort(meetings,(a,b) -> {
        if(a[1] == b[1]) return a[2] - b[2];
        return a[1] - b[1];
            
        });
        int count = 1;
        int freetime = meetings[0][1];
        ArrayList<Integer> order = new ArrayList<>();
        order.add(meetings[0][2]);
        
        for(int i = 0; i < n; i++)
        {
            if(meetings[i][0] > freetime)
            {
                count++;
                freetime = meetings[i][1];
                order.add(meetings[i][2]);
                
            }
        
    }
    return count;
    
}
}