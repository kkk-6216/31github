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
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;

        if(head == null || head.next == null) return head;
        if(head.next != null) head = head.next;
        ListNode a = null;
        ListNode b = null;

        while(curr != null && curr.next != null){

            a = curr;
            curr = curr.next;
            if(b != null){
                b.next = curr;
            }
            a.next = curr.next;
            curr.next = a;
            b = a;

            curr = curr.next;
            curr = curr.next;
                
        } 

        return head;
    }
}
