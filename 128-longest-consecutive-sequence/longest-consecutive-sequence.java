class Solution {
    public int longestConsecutive(int[] nums) 
    {
        Arrays.sort(nums);
        int c = 1;
        int max = 1;
        if(nums.length==0)
        {
            return 0;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]==nums[i])
            {
                continue;
            }
            else if(nums[i+1]==nums[i]+1)
            {
                c++;
            }
            else
            {
                c=1;
            }
            if(c>max)
            {
                max=c;
            }
        }
        return max;
    }
}