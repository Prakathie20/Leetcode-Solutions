class Solution {
    public int maxArea(int[] h) 
    {
        int l = 0;
        int r = h.length-1;
        int max = 0;
        while(l<r)
        {
            int w = r-l;
            int h1 = Math.min(h[l],h[r]);
            int a = w*h1;
            if(a>max)
            {
                max=a;
            }
            if(h[l]<h[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return max;
    }
}