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
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode current=head;
        int count=0;
        while(current!=null)
        {
            current=current.next;
            count++;
        }
       
        current=head;
        int c=0;
        while(current!=null&& c<count/2)
        {
            current=current.next;
            c++;
        }
        
        return current;
    }
}