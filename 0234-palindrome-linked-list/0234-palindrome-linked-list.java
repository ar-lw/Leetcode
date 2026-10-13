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
        ListNode curr=head;
        int n=0;
        while(curr!=null){
            curr=curr.next;
            n++;
        }
        curr=head;
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=curr.val;
            curr=curr.next;
        }
        int j=n-1;

        for(int i=0;i<=j;i++){
            if(i!=j && nums[i]!=nums[j]){
                return false;
            }
            j--;
        }
        return true;



        

        
    }
}