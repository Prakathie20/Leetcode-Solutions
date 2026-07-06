class Solution {
    public boolean isMonotonic(int[] nums) 
    {
        boolean b = true;
        boolean b1=true;
        for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i] < nums[i+1])
                {
                   b=false;
                }
                else if(nums[i] > nums[i+1])
                {
                    b1=false;
                }
            }
            return b || b1;

    }
}