class Solution 
{
    public int addDigits(int num) 
    {
        int Sum = 0;
        while(num != 0)
        {
            int d = num % 10;
            Sum = Sum + d;
            num = num/10;
            if(num == 0 && Sum > 9)
            {
                num = Sum;
                Sum = 0;
            }
        }
        return Sum;
    }
}