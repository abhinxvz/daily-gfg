/*
Problem: Transitive Closure Of A Graph0930
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/transitive-closure-of-a-graph0930/1
*/

for(int i = 0 ; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                dist[i][j] = graph[i][j];
            }
            dist[i][i] = 1;
            
        }
        for(int k = 0; k < N; k++) {
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(dist[i][k] ==1 && dist[k][j] == 1)
                    {
                        dist[i][j] = 1;
                    }
                }}}
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
                for(int i = 0; i < N; i++) {
                ArrayList<Integer> row = new ArrayList<>();

                for(int j = 0; j < N; j++) {
                   row.add(dist[i][j]);
            }
            result.add(row);
        }
        
        return result;
    }}