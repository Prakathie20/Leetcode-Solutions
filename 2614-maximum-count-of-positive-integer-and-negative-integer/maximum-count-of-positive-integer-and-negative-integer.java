class Solution {
    public int maximumCount(int[] nums) 
    {
        int n = nums.length;
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                c1++;
            }
            if(nums[i]>0)
            {
                c2++;
            }
        }
        if(c1>c2)
        {
            return c1;
        }
        return c2;
    }
}