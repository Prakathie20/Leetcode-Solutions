class Solution {
    public int maxProductDifference(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        int t1 = nums[0] * nums[1];
        int t2 = nums[n-1]*nums[n-2];
        int r = t2-t1;
        return r;
    }
}