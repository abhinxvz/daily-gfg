/*
Problem: Number Of Provinces
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/number-of-provinces/1
*/

// User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean [] visited = new boolean[V];
        int provinces = 0;
        for(int i = 0; i < V; i++)
        {
            if(!visited[i])
            {
                dfs(adj,V,visited,i);
            
            provinces++;
            }
        }
        return provinces;
        
    }
    private static void dfs(ArrayList<ArrayList<Integer>> adj, int V, boolean [] visited, int city)
    {
        visited[city] = true;
        for(int neighbor = 0 ; neighbor < V; neighbor++)
        {
            if(adj.get(city).get(neighbor)==1 && !visited[neighbor])
            {
                 dfs(adj,V,visited,neighbor);
            }
    }
}
}