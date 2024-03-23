/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public void reorderList(ListNode head) 
    {
        ListNode result = head;
        List<Integer> arraylist = new ArrayList<>();

        while(head != null)
        {
            arraylist.add(head.val);
            head = head.next;
        }

        int n = arraylist.size();

        for(int i = 0; i<n/2; i++)
        {
            result.val = arraylist.get(i);
            result = result.next;
            result.val = arraylist.get(n-i-1);
            result = result.next;
        }

        if(n%2==1)
        result.val=arraylist.get(n/2);
    }
}