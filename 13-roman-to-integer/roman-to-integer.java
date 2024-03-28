class Solution 
{
    int value(char r)
    {
        if(r == 'I')
        return 1;

        if (r == 'V')
        return 5;

        if (r == 'X')
        return 10;

        if (r == 'L')
        return 50;

        if (r == 'C')
            return 100;

        if (r == 'D')
            return 500;

        if (r == 'M')
            return 1000;

        return -1;
    }
    /*public int romanToInt(String roman_number) 
    {
        int result = 0;

        for(int i = 0;i< roman_number.length();i++)
        {
            int s1 = value(roman_number.charAt(i));

            if(i+1 < roman_number.length())
            {
                int s2 = value(roman_number.charAt(i+1));

                if(s1 >= s2)
                result += s1;

                else
                {
                    result = result + s2 - s1;
                    i++;
                }
            }

            else
            result = result + s1;
        }

        return result;
    }*/
    public int romanToInt(String roman_number)
    {
        int ans = 0, num = 0;
        for(int i = roman_number.length() - 1;i >= 0; i--)
        {
            num = value(roman_number.charAt(i));

            if(4 * num < ans)
            ans -= num;

            else
            ans += num;

        }
        return ans;
    }
}