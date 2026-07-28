class Solution {
    public int maxProduct(int[] nums) 
    {
        int n = nums.length;
        int max = 0;
        Arrays.sort(nums);
        int n1 = nums[n-1];
        int n2 = nums[n-2];
        int r = n1-1;
        int r1 = n2-1;
        int t = r*r1;
        return t;
    }
}