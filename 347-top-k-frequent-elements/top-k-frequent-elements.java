class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        int n = nums.length;
        boolean[] b = new boolean[n];
        int freq[] = new int[n];
        int[] v = new int[n];
        int k1=0;
        for(int i=0;i<n;i++)
        {
            if(b[i])
            {
                continue;
            }
            int c=1;
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    b[j]=true;
                    c++;
                }
            }
            freq[k1]=c;
            v[k1]=nums[i];
            k1++;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(freq[i]<freq[j])
                {
                int temp = freq[i];
                freq[i]=freq[j];
                freq[j]=temp;

                temp=v[i];
                v[i]=v[j];
                v[j]=temp;
                }
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=v[i];
        }
        return ans;
    }
}