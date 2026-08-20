class Solution {
    public int minimumIndex(int[] capacity, int itemSize) 
    {
        int n = capacity.length;
        int min = 0;
        int ind = -1;

        for(int i = 0; i < n; i++)
        {
            if(capacity[i] >= itemSize)
            {
                min = capacity[i];
                ind = i;
                break;
            }
        }

        if(ind == -1)
        {
            return -1;
        }

        for(int i = ind + 1; i < n; i++)
        {
            if(capacity[i] >= itemSize && capacity[i] < min)
            {
                min = capacity[i];
                ind = i;
            }
        }

        return ind;
    }
}