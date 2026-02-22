/*
Problem: Distance From The Source Bellman Ford Algorithm
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/1
*/

import java.util.*;

class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        int dist[] = new int[V];
        Arrays.fill(dist, (int)1e8);
        dist[src] = 0;
        
        for(int i = 0; i < V - 1; i++) {
            for(int edge[] : edges) {
                int u = edge[0];
                int v = edge[1];
                int weight = edge[2];
                
                if(dist[u] != (int)1e8 && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                }
            }
        }

        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];
            
            if(dist[u] != (int)1e8 && dist[u] + weight < dist[v]) {
                return new int[]{-1};
            }
        }
        
        return dist;
    }