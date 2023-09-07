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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1111, head);
        if( left == right )
            return dummy.next;
        
        ListNode prev = dummy;
        for(int i = 1 ; i < left ; i++){
            prev = prev.next;
        }
        ListNode tail = prev.next;
        
        // System.out.println(tail.val+"__"+prev.val);
        for( int i = 0 ; i < right - left ; i++){
            ListNode temp = prev.next;
            prev.next = tail.next;
            tail.next = tail.next.next;
            prev.next.next = temp;
            
            // System.out.println(tail.val+"__"+prev.val);
        }
        return dummy.next;
    }
}