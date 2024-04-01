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

        //Approach 2: 
        //return num == 6 || num == 28 || num == 496 || num == 8128 || num == 33550336;

    }
}