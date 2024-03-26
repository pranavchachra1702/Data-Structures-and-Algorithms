class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        //Approach 1:
        List<Integer> arraylist = new ArrayList<>();
        for(int num: nums)
        arraylist.add(num);

        return new int[]{arraylist.indexOf(target), arraylist.lastIndexOf(target)};
    }
}