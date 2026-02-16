/*
Problem: Bfs Traversal Of Graph
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
*/

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[n];
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty())
        {
            int node = q.poll();
            bfs.add(node);
            for(int neighbour : adj.get(node))
            {
                if(!visited[neighbour])
                {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        
            
        }
        return bfs;
        
        
    }
}