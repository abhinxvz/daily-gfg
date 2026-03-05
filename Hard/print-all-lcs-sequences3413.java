/*
Problem: Print All Lcs Sequences3413
Difficulty: Hard
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/print-all-lcs-sequences3413/1
*/

Set<String> result = solve(s1,s2,m,n,dp);

        return new ArrayList<>(new TreeSet<>(result));
    }

    Set<String> solve(String s1,String s2,int i,int j,int[][] dp){

        if(i==0 || j==0){
            Set<String> base = new HashSet<>();
            base.add("");
            return base;
        }

        String key = i + "|" + j;

        if(memo.containsKey(key))
            return memo.get(key);

        Set<String> result = new HashSet<>();

        if(s1.charAt(i-1)==s2.charAt(j-1)){
            for(String str : solve(s1,s2,i-1,j-1,dp))
                result.add(str + s1.charAt(i-1));
        }
        else{

            if(dp[i-1][j] >= dp[i][j-1])
                result.addAll(solve(s1,s2,i-1,j,dp));

            if(dp[i][j-1] >= dp[i-1][j])
                result.addAll(solve(s1,s2,i,j-1,dp));
        }

        memo.put(key,result);

        return result;
    }
}