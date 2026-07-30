class Solution {
    public String freqAlphabets(String s) 
    {
        String ans = "";
        int i=0;
        while(i<s.length())
        {
            if(i+2<s.length() && s.charAt(i+2)=='#')
            {
                int num = (s.charAt(i)-'0')*10+(s.charAt(i+1)-'0');
                ans = ans+(char)('a'+num-1);
                i=i+3;
            }
            else
            {
                int num = s.charAt(i)-'0';
                ans = ans+(char)('a'+num-1);
                i++;
            }
        }
        return (ans);
    }
}