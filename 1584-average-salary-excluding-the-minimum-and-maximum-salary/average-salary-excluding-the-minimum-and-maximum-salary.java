class Solution {
    public double average(int[] salary) 
    {
        int n = salary.length;
        Arrays.sort(salary);
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum+salary[i];
        }
        //int t1 = salary[n-1];
        //int t2 = salary[0];

        int t = sum-salary[0]-salary[n-1];
        return (double)t/(n-2);

    }
}