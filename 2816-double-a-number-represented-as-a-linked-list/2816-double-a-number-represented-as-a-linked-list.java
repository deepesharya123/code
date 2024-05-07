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
    
    public ListNode reverse(ListNode head){
        ListNode cur = head, prev = null ;
        while( cur != null ){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        return prev;
    }
    
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        ListNode cur = head , prev = null;
        int carry = 0 ;
        while( cur != null ){
            int num = cur.val;
            num*=2;
            num+=carry;
            carry = num / 10;
            num = num % 10;
            cur.val = num;
            prev = cur;
            cur = cur.next;
        }
        if( carry > 0 ){
            ListNode newNode =  new ListNode( carry);
            prev.next = newNode;
        }
        head = reverse(head);
        return head;
    }
}