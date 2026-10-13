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
    public boolean isPalindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode prev=null;
        ListNode curr=slow;
        int count=0;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        curr=head;
        int i=0;
        while(i<count){
            if(!(prev.val==curr.val)){
                return false;
            }
            i++;
            curr=curr.next;
            prev=prev.next;
        }
        return true;
    }
}