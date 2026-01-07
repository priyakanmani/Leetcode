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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr=head;
        ListNode dummy=head;
        if(head==null) return head;
        int length=1;
        while(curr.next!=null)
        {
            curr=curr.next;
            length++;
        }
        k=k%length;
        if(k==0) return head;
        for(int i=0;i<length-k-1;i++)
        {
            dummy=dummy.next;
        }
        
        ListNode newNode=dummy.next;
        dummy.next=null;
        curr.next=head;
        return newNode;
    }
}