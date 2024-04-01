class Solution 
{
    public int firstUniqChar(String s) 
    {
        s = s.toLowerCase();
        int len = s.length();
        int hashtable[] = new int[26];

        for(int i = 0; i < len; i++)
        {
            char ch = s.charAt(i);
            hashtable[ch - 'a']++;
        }
        for(int i = 0; i < len; i++)
        {
            char ch = s.charAt(i);
            if(hashtable[ch - 'a'] == 1)
            return i;
        }
        return -1;
    }
}