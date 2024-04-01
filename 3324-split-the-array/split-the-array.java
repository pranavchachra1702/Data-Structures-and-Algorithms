class Solution 
{
    public boolean isPossibleToSplit(int[] nums) 
    {
       Map<Integer, Integer> map1 = new HashMap<>();

       for(int i : nums)
       {
        map1.put(i, map1.getOrDefault(i, 0) + 1);
        if(map1.get(i) > 2)
        return false;
       } 
       return true;
    }
}