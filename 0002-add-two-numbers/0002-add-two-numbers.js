/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let nhead=new ListNode(0);
    let dummy=nhead;
    let carry=0;
    while(l1!=null || l2!=null || carry!=0)
    {
        let d1=(l1!=null?l1.val:0);
        let d2=(l2!=null?l2.val:0);
        let sum=d1+d2+carry;
        let digit=sum%10;
        carry=Math.floor(sum/10);
        let newnode=new ListNode(digit);
        dummy.next=newnode;
        dummy=dummy.next;
        l1=(l1!=null?l1.next:null);
        l2=(l2!=null?l2.next:null);
    }
    return nhead.next;
};