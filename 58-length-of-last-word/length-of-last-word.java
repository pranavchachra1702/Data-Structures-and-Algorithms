class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        s = s.trim();
        s=" "+s;
        String word = "";
        for(int i = s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            word+=ch;

            else
            return word.length();
        }
        return 0;
    }
}