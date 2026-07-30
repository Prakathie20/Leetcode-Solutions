class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        ransomNote=ransomNote.toLowerCase();
        magazine=magazine.toLowerCase();
        StringBuilder sb = new StringBuilder(magazine);
        for(int i=0;i<ransomNote.length();i++)
        {
            boolean f = false;
            for(int j=0;j<sb.length();j++)
            {
               if(ransomNote.charAt(i)==sb.charAt(j))
               {
                    sb.deleteCharAt(j);
                    f=true;
                    break;
               }
            }
            if(!f)
            {
                return false;
            }
        }
       return true;
    }
}