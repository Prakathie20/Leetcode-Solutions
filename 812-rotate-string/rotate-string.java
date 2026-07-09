class Solution {
    public boolean rotateString(String s, String goal) 
    {
        s.toLowerCase();
        if(s.length()==goal.length())
        {
            if((s+s).contains(goal))
            {
                return true;
            }
        }
        return false;
    }
}