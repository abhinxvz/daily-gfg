/*
Problem: Depth First Traversal For A Graph
Difficulty: Easy
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
*/

class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean visited[] = new boolean[n];
        ArrayList<Integer> res = new ArrayList<>();
        dfsRec(adj,visited,res,0);
        return res;
    
}
static void dfsRec(ArrayList<ArrayList<Integer>> adj,boolean visited[], ArrayList<Integer> res, int s)
{
    visited[s] = true;
    res.add(s);
    for(int i : adj.get(s))
    {
        if(!visited[i])
        {
            dfsRec(adj,visited,res,i);
        }
    }
}}