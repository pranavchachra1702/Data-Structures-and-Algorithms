class Solution 
{
    public int firstMissingPositive(int[] nums) 
    {
        int n = nums.length;
        /* Logic 1:
        TC = O(n), SC = O(n)
        boolean[] seen = new boolean[n + 1];

        for(int num : nums)
        {
            if(num > 0 && num <= n)
            seen[num] = true;
        }

        for(int i = 1; i <= n; i++)
        {
            if(!seen[i])
            return i;
        }
        */

        // Logic 2: 
        // TC: O(n), SC: O(1) 
        for(int i = 0; i < n; i++)
        {
            if(nums[i] <= 0 || nums[i] > n)
            nums[i] = n + 1;
        }

        for(int i = 0; i < n; i++)
        {
            int num = Math.abs(nums[i]);

            if(num <= n)
            nums[num - 1] = -Math.abs(nums[num - 1]);
        }

        for(int i = 0; i < n; i++)
        {
            if(nums[i] > 0)
            return i + 1;
        }
        return n + 1;
    }
}