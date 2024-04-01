class Solution 
{
    private int encrypt(int x)
    {
        int countofdigits = 0;
        int maxdigit = 0;
        while(x != 0)
        {
            int digit = x%10;
            countofdigits++;

            if(digit > maxdigit)
            maxdigit = digit;

            x/=10;
        }
        int num=0;
        for(int i = 1; i<=countofdigits;i++)
        num = num *10+1;

        return num * maxdigit;
    }

    public int sumOfEncryptedInt(int[] nums) 
    {
        int Sum = 0;
        for(int i : nums)
           Sum += encrypt(i);
        return Sum;
    }
}