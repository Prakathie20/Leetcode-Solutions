class Solution {
    public String truncateSentence(String s, int k) 
    {
        String[] str = s.split(" ");
        String[] t = new String[k];
        for(int i=0;i<k;i++)
        {
            t[i]=str[i];
        }
        return String.join(" ",t);
    }
}