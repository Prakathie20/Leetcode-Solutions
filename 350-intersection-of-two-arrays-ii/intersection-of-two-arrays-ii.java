class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int k=0;
        boolean[] b = new boolean[n2];
        int[] arr = new int[n1];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(nums1[i]==nums2[j] && b[j]==false)
                {
                    arr[k]=nums1[i];
                    k++;
                    b[j]=true;
                    break;
                }   
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=arr[i];
        }
        return ans;
    }
}