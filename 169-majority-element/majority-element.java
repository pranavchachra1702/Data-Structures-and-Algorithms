class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int n = nums.length;
        Map<Integer, Integer> element_freq = new HashMap<>();

        for(int i = 0; i<n ; i++)
            element_freq.put(nums[i], element_freq.getOrDefault(nums[i], 0)+1);

        n = n/2;
        for (Map.Entry<Integer, Integer> entry : element_freq.entrySet())
        {
            if(entry.getValue() > n)
            return entry.getKey();
        }   

        return 0;
    }
}