class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
       int n = arr.length;
       boolean[] v = new boolean[n];
       int[] f = new int[n];
       int k=0;
       for(int i=0;i<n;i++)
       {
        if(v[i])
        {
            continue;
        }
        int c=1;
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                v[j]=true;
                c++;
            }
        }
        for(int j=0;j<k;j++)
        {
            if(f[j]==c)
            {
                return false;
            }
        }
        f[k]=c;
        k++;
       }
       return true;
    }
}