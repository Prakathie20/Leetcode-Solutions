class Solution {
    public String frequencySort(String s) 
    {
        int n = s.length();
        int k=0;
        boolean[] b = new boolean[n];
        int[] v = new int[n];
        int[] freq = new int[n];
        for(int i=0;i<n;i++)
        {
            if(b[i])
            {
                continue;
            }
            int c = 0;
            for(int j=0;j<n;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    b[j]=true;
                    c++;
                }
            }
            v[k]=s.charAt(i);
            freq[k]=c;
            k++;
        }

        for(int i=0;i<k;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                if(freq[i]<freq[j])
                {
                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    temp = v[i];
                    v[i]=v[j];
                    v[j]=temp;
                }
            }
        }
        String ans = "";
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<freq[i];j++)
            {
                ans=ans+(char)v[i];
            }
        }
        return ans;
    }
}