// We just need to check which number is common in every pair or edges.

class Solution 
{
    public int findCenter(int[][] e) 
    {
        return e[0][0] == e[1][0] || e[0][0] == e[1][1] ? e[0][0] : e[0][1];
    }
}