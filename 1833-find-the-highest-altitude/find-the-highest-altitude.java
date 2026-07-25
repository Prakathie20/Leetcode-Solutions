class Solution {
    public int largestAltitude(int[] gain) 
    {
        int n = gain.length;
        int[] a = new int[n+1];
        a[0] = 0;
        for(int i=0;i<n;i++)
        {
           a[i+1] = a[i]+gain[i];
        }
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
}