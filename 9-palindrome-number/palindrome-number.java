class Solution
{
    public boolean isPalindrome(int x)
    {
        if(x<0)
        return false;

        int number = x;
        int Reverse = 0;

        while(x!=0)
        {
            int digit = x%10;
            Reverse = Reverse * 10 + digit;
            x=x/10;
        }

        if(Reverse == number)
        return true;

        return false;
    }
}