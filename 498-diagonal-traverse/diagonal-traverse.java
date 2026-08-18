class Solution {
    public int[] findDiagonalOrder(int[][] mat) 
    {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m*n];
        int k=0;
        
        for(int d = 0; d < m + n - 1; d++)
        {
            if(d % 2 == 0)
            {
                for(int i = m - 1; i >= 0; i--)
                {
                    for(int j = 0; j < n; j++)
                    {
                        if(i + j == d)
                        {
                            ans[k] = mat[i][j];
                            k++;
                        }
                    }
                }
            }
            else
            {
                for(int i = 0; i < m; i++)
                {
                    for(int j = 0; j < n; j++)
                    {
                        if(i + j == d)
                        {
                            ans[k] = mat[i][j];
                            k++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}