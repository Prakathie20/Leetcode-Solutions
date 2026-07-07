class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int n1=nums.length;
        return (nums[n1-k]);
    }
}