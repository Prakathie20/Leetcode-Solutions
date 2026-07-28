class Solution {
    public int[] replaceElements(int[] arr) 
    {
        int n = arr.length;
        int[] max = new int[n];
        max[n-1]=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(max[i]<arr[j])
                {
                    max[i] = arr[j];
                }
            }
        }
        return max;
    }
}