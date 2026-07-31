class Solution {
    public String reversePrefix(String word, char ch) 
    {
       int n = word.length();
       String str="";
       for(int i=0;i<n;i++)
       {
          if(word.charAt(i)==ch)
          {
            for(int j=i;j>=0;j--)
            {
                str = str+word.charAt(j);
            }
            for(int k=i+1;k<n;k++)
            {
                str = str+word.charAt(k);
            }
             return str;
          }
       }
       return word;
    }
}