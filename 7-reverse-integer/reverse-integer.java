class Solution
{
    public int reverse(int x)
    {
        long finalNumber = 0;

        while(x!=0)
        {
            int digit = x%10;
            finalNumber = finalNumber * 10 + digit;
            x=x/10;
        }

        if(finalNumber > Integer.MAX_VALUE || finalNumber < Integer.MIN_VALUE)
        return 0;

        if(x<0)
        return (int) (-1 * finalNumber);

        return (int)finalNumber;
    }
}