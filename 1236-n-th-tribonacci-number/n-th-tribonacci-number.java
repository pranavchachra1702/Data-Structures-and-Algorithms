class Solution 
{
    public int tribonacci(int n) 
    {
        int T0 = 0, T1 = 1, T2 = 1;
        int Tn=0;
        if(n==0)
        return 0;
        if(n==1||n==2)
        return 1;
        for(int i = 0;i<=n-3;i++)
        {
            Tn = T0+T1+T2;
            T0=T1;
            T1=T2;
            T2=Tn;
        }
        return Tn;
    }
}