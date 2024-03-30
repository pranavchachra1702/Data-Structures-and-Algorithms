class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
/*  Approach 1:
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

*/
    // Approach 2:
    int count[] = new int[26];

    for(char x : s.toCharArray())
    count[x - 'a']++;

    for(char x : t.toCharArray())
    count[x - 'a']--;

    for(int val : count)
      if(val != 0)
       return false;

        return true;

    }
}