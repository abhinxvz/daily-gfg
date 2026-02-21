/*
Problem: Implementing Floyd Warshall2042
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1
*/

class Solution {
    public void floydWarshall(int[][] dist) {
        int n = dist.length;
        int INF = 100000000;
        
        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    
                    if(dist[i][k] != INF && 
                       dist[k][j] != INF &&
                       dist[i][k] + dist[k][j] < dist[i][j]) {
                        
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
    }
}