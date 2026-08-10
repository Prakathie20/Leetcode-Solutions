class Solution {
    public int[] frequencySort(int[] nums) 
    {
        int n = nums.length;
        boolean[] v = new boolean[n];
        int[] value = new int[n];
        int[] freq = new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(v[i])
            {
                continue;
            }
            int c = 1;
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    v[j]=true;
                    c++;
                }
            }
            value[k]=nums[i];
            freq[k]=c;
            k++;
        }
        for(int i=0;i<k;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                if(freq[i]>freq[j] || (freq[i]==freq[j] && value[i]<value[j]))
                {
                    int temp = freq[i];
                    freq[i]=freq[j];
                    freq[j]=temp;

                    temp=value[i];
                    value[i]=value[j];
                    value[j]=temp;
                }
            }
        }

        int[] ans = new int[n];
        int k1 = 0;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<freq[i];j++)
            {
                ans[k1++]=value[i];
            }
        }
        return ans;
    }
}