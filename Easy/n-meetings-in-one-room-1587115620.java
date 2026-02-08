/*
Problem: N Meetings In One Room 1587115620
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
*/

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
         int n = start.length;
        List<int[]> meeting = new ArrayList<>();
       
        for(int i = 0 ; i < n ; i++)
        {
        meeting.add(new int[]{start[i],end[i]});
        }
        meeting.sort((a,b) -> a[1] - b[1]);
        int count = 1;
        int lastind = meeting.get(0)[1];
           for (int i = 1; i < n; i++) {
        if(meeting.get(i)[0] > lastind)
        {
            count++;
            lastind = meeting.get(i)[1];
        }
        
    }
    return count;
}
}