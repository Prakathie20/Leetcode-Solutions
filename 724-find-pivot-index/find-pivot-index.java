class Solution {
    public int pivotIndex(int[] nums) 
    {
       int l = 0,r;
       for(int i=0;i<nums.length;i++)
       {
        r=0;
        for(int j=i+1;j<nums.length;j++)
        {
            r=r+nums[j];
        }
        if(l==r)
        {
           return i;
        }
        l=l+nums[i];
       }
       return -1;
    }
}