class Solution {
    public int countAsterisks(String s) 
    {
        int n = s.length();
        int c=0;
        boolean f = false;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='|')
            {
                f = !f;
            }
            else if(s.charAt(i)=='*' && f==false)
            {
                c++;
            }
        }
        return c;
    }
}