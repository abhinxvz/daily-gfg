/*
Problem: Spirally Traversing A Matrix 1587115621
Difficulty: Medium
Tags: N/A
URL: https://www.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
*/

int top =0;
        int bottom = mat.length - 1;
        int left = 0;
        int right = mat[0].length -1;
        while(top<=bottom && left<=right)
        {
            for(int j = left; j<=right; j++)
            {
                res.add(mat[top][j]);
            }
            top++;
            for(int i = top ; i <= bottom; i++)
            {
                res.add(mat[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int j = right ; j >= left; j--)
                {
                    res.add(mat[bottom][j]);
                }
                bottom--;
            }
            if(left <= right)
            {
                for(int i = bottom ; i >= top; i--)
                {
                    res.add(mat[i][left]);
                }
            }
            left++;
        }
        return res;

    }
}