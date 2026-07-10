class Solution {
    public int majorityElement(int[] nums) 
    {
        Arrays.sort(nums);
        int n = nums.length;
        int d = n/2;
        boolean[] b = new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(b[i])
            {
                continue;
            }
            int c = 1;
            for(int j = i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    b[j]=true;
                    c++;
                }
            }
            if(c>n/2)
            {
                return nums[i];
            }
        }
        return -1;
    }
}