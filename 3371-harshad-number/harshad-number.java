class Solution 
{
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    {
        int sumofdigits = 0,n = x;
        while(n != 0)
        {
            int d = n % 10;
            n = n/10;
            sumofdigits += d;
        }

        if(x%sumofdigits == 0)
        return sumofdigits;

        return -1;
    }
}