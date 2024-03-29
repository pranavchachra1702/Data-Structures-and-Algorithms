class Solution 
{
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        int result = 0;
        int n = nums.length;
        int l = 0;

        long t = 1;

        for(int i = 0; i < n; i++)
        {
            t = t * nums[i];
            while(t>=k && l<=i)
            {
                result = result + i - l;
                t = t/nums[l++];
            }

        }
        
        long r = n - l;
        result += r * (r + 1) / 2;

        return result;
    }
}