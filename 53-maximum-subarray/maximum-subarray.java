class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int s=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            s=s+nums[i];
        if(s>max)
        {
            max=s;
        }
        if(s<0)
        {
            s=0;
        }
        }
         return max;
    }
}