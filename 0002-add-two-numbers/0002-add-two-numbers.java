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

import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val==0&& l1.next==null  && l2.val==0 && l2.next==null){
            return new ListNode(0);
        }
        ListNode prev1=null;
        ListNode curr1=l1;
        ListNode prev2=null;
        ListNode curr2=l2;
        while(curr1!=null){
            ListNode next=curr1.next;
            curr1.next=prev1;
            prev1=curr1;
            curr1=next;
        }
        while(curr2!=null){
            ListNode next=curr2.next;
            curr2.next=prev2;
            prev2=curr2;
            curr2=next;
        }
        BigInteger n1 = BigInteger.ZERO;
        BigInteger n2 = BigInteger.ZERO;
        while(prev1!=null){
            n1 = n1.add(BigInteger.valueOf(prev1.val));
            prev1=prev1.next;
            if(prev1!=null){
                n1 = n1.multiply(BigInteger.TEN);
            }
        }
        while(prev2!=null){
            n2=n2.add(BigInteger.valueOf(prev2.val));
            prev2=prev2.next;
            if(prev2!=null){
                n2=n2.multiply(BigInteger.TEN);
            }
        }
        BigInteger sum=n1.add(n2);
        ListNode res=new ListNode();
        ListNode curr=res;
        while(sum.signum()>0){
            int d=sum.mod(BigInteger.TEN).intValue();
            curr.next=new ListNode(d);
            curr=curr.next;
            sum=sum.divide(BigInteger.TEN);
        }
        return res.next;

    }
}