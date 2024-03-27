class Solution 
{
    public boolean isHappy(int n) 
    {
        int S=0;
        while(n!=0)
        {
            int d = n%10;
            S = S+ d*d;
            n=n/10;
            if(n==0 && S>9)
            {
                n=S;
                S=0;
            }
        }
        if(S==1 || S==7)
        return true;

        return false;
    }
}