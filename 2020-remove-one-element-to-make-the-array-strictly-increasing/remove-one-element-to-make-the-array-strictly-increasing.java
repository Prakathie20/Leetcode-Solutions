class Solution {
    public boolean canBeIncreasing(int[] nums) 
    {
       int n = nums.length;
       int c = 0;
       for(int i=0;i<n-1;i++)
       {
        if(nums[i]>=nums[i+1])
        {
            c++;
        }
        if (i > 0 && nums[i - 1] >= nums[i + 1]) 
        {
            if (i + 2 < n && nums[i] >= nums[i + 2]) 
            {
                return false;
            }
        }        
       }
       
       if(c>1)
       {
        return false;
       } 
       return true;
    }
}