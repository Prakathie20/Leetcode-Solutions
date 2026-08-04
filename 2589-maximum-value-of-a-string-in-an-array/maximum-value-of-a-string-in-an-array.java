class Solution {
    public int maximumValue(String[] strs) 
    {
        int m = 0;
        for(int i=0;i<strs.length;i++)
        {
            boolean f = true;
           for(int j=0;j<strs[i].length();j++)
           {
            char ch = strs[i].charAt(j);
            if(ch<'0' || ch>'9')
            {
                f=false;
                break;
            }
           }
        int v;
        if(f)
        {
           v = Integer.parseInt(strs[i]); 
        }
        else
        {
            v=strs[i].length();
        }
        if(v>m)
        {
            m = v;
        }
        }
        return m;
    }
}