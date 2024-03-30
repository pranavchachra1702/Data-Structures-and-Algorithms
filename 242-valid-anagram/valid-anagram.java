class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
        return false;

        Map<Character, Integer> map1=new HashMap<>();

        for(char x : s.toCharArray())
        map1.put(x, map1.getOrDefault(x, 0) + 1);

        for(char x : t.toCharArray())
        map1.put(x, map1.getOrDefault(x, 0) - 1);

        for(int val : map1.values())
        {
            if(val != 0)
            return false;
        }

        return true;

    }
}