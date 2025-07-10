class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double s=0;
        int n=nums.length;
        for(int i=0;i<k;i++)
        {
            s=s+nums[i];
        }
        double max=s;
        for(int i=k;i<n;i++)
        {
            s=s+nums[i]-nums[i-k];
        if(s>max)
        {
            max=s;
        }
        }
        return max/k;
    }
}