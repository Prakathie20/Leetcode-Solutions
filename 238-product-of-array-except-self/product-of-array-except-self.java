class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] r=new int[n];

        r[0]=1;
        for(int i=1;i<n;i++)
        {
           r[i]=r[i-1]*nums[i-1]; 
        }

        int right=1;
        for(int i=n-1;i>=0;i--)
        {
            r[i]=r[i]*right;
            right=right*nums[i];
        }
        return r;
    }
}