class Solution {
    public int scoreOfString(String s) 
    {
        int sum = 0;
        int n=0;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch = s.charAt(i);
            char ch1 = s.charAt(i+1);
            int n1 = (int)ch;
            int n2 = (int)ch1;
            sum = Math.abs(n1-n2);
            n = n+sum;
        }
        return n;
    }
}