class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
           if(i>k)
           {
                window.remove(nums[i-k-1]);
           }
           if(!window.add(nums[i]))
           {
                return true;
           }
        }
        return false;
    }
}