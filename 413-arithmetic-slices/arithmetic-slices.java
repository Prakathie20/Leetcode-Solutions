class Solution {
    public int numberOfArithmeticSlices(int[] nums) 
    {
        int n = nums.length;
        int c = 0;
        int cu = 0;
        if(n<3) return 0;
        int d = nums[1]-nums[0];
        for(int i=2;i<n;i++)
        {
            if(nums[i]-nums[i-1]==d)
            {
                cu++;
                c=c+cu;
            }
            else
            {
                d = nums[i]-nums[i-1];
                cu=0;
            }
        }
        return c;
    }
}