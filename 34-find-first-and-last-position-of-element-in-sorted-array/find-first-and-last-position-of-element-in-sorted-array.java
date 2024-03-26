class Solution 
{
    int firstPosition(int[] nums, int n, int target)
    {
        int low = 0, high = n-1;
        int first = -1;

        while(low <= high)
        {
            int mid = low + (high -low)/2;

            if(nums[mid] == target)
            {
                first = mid;
                high = mid - 1;
            }

            else if(nums[mid] < target)
            low = mid + 1;

            else
            high = mid - 1;

        }

        return first;
    }

    int lastPosition(int[] nums, int n, int target)
    {
        int low = 0, high = n-1;
        int last = -1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(nums[mid] == target)
            {
                last = mid;
                low = mid + 1;
            }

            else if(nums[mid] < target)
            low = mid + 1;

            else
            high = mid - 1;
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) 
    {
        /*Approach 1: 
        TC: O(n)

        List<Integer> arraylist = new ArrayList<>();
        for(int num: nums)
        arraylist.add(num);

        return new int[]{arraylist.indexOf(target), arraylist.lastIndexOf(target)};
        */

        //Approach 2: Binary Search
        // TC: O(log n)

        int n = nums.length;
        int first = firstPosition(nums, n, target);

        if(first == -1)
        return new int[] {-1, -1};

        int last = lastPosition(nums, n ,target);

        return new int[] {first, last};
    }
}