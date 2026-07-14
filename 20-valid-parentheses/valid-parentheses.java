class Solution {
    public boolean isValid(String s) 
    {
       if(s==null || s.length()%2!=0) 
       {
        return false;
       }
        Deque<Character> Stack = new ArrayDeque<>();
       for(char c : s.toCharArray())
       {
        if(c=='(')
        {
            Stack.push(')');
        }
        else if(c=='{')
        {
            Stack.push('}');
        }
        else if(c=='[')
        {
            Stack.push(']');
        }
        else
        {
            if(Stack.isEmpty() || Stack.pop()!=c)
            {
                return false;
            }
        }
       }
       return Stack.isEmpty();
    }
}