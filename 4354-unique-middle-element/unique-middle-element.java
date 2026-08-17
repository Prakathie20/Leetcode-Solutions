class Solution {
    public boolean isMiddleElementUnique(int[] nums) 
    {
        int n = nums.length;
        int l = n/2;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==nums[l])
            {
                c++;
            }
        }
        if(c==1)
        {
            return true;
        }
        return false;
    }
}