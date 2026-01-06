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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode res=new ListNode(0,head);
        ListNode dummy=res;
        int f=0;
        for(int i=0;i<k;i++)
        {
            if(i==k-1)  f=head.val;
            head=head.next;
        }
       
        while(head!=null)
        {
            head=head.next;
            dummy=dummy.next;
        }
        int l=dummy.next.val;
        dummy.next.val=f;
        ListNode dummy1=res;
        for(int i=0;i<k;i++)
        {
            dummy1=dummy1.next;
        }
        dummy1.val=l;
        return res.next;
    }
}