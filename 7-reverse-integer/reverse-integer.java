class Solution {
    public int reverse(int x) 
    {
        boolean neg = x<0;
        long r=0;
        while(x!=0)
        {
            int d = Math.abs(x%10);
            r = (r*10) + d;
            x=x/10;
        }
        if(r > Integer.MAX_VALUE)
        {
            return 0;
        }
        if(neg)
        {
            return (int)-r;
        }
        return (int)r;
    }
}