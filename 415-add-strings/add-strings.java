class Solution {
    public String addStrings(String num1, String num2) 
    {
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;
        String ans = "";

        while(i >= 0 || j >= 0)
        {
            int n1 = 0;
            int n2 = 0;

            if(i >= 0)
            {
                n1 = num1.charAt(i) - '0';
            }

            if(j >= 0)
            {
                n2 = num2.charAt(j) - '0';
            }

            int r = n1 + n2 + carry;

            int digit = r % 10;
            carry = r / 10;

            ans = (char)(digit + '0') + ans;

            i--;
            j--;
        }

        if(carry > 0)
        {
            ans = (char)(carry + '0') + ans;
        }

        return ans;
    }
}