class Solution {
    public int findMaxK(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        int max = -1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                for(int j=0;j<i;j++)
                {
                    if(nums[j] == -nums[i])
                    {
                        if(nums[i]>max)
                        {
                            max=nums[i];
                        }
                    }
                }  
            }
        }
        return max;
    }
}