class Solution {
    public int balancedStringSplit(String s) 
    {
        int b = 0;
        int sp=0;
        for(char c:s.toCharArray())
        {
            b += (c=='L')?1:-1;
            if(b==0)
            {
                sp++;
            }
        }
        return sp;
    }
}