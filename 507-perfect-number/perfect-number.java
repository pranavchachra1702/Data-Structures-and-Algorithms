class Solution 
{
    public boolean checkPerfectNumber(int num) 
    {
        int Sum = 0;

        for(int i = 1;i< num;i++)
        if(num%i == 0)
        Sum = Sum + i;

        if(Sum == num)
        return true;

        return false;

    }
}