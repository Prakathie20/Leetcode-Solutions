class Solution {
    public int maximum69Number (int num)
    {
        String a = String.valueOf(num);
        String a1=a.replaceFirst("6","9");
        return Integer.parseInt(a1);
    }
}