class Solution {
    public String reverseWords(String s) 
    {
        char[] ch = s.toCharArray();
        int st = 0;
        for(int i = 0;i<=ch.length;i++)
        {
            if(i==ch.length || ch[i]==' ')
            {
                int a = st;
                int b = i-1;
                while(a<b)
                {
                    char temp = ch[a];
                    ch[a]=ch[b];
                    ch[b]=temp;
                    a++;
                    b--;
                }
                st = i+1;
            }
        }
            return new String(ch);
    }
}