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
    
    public ListNode reverseListNode(ListNode start){
        ListNode prev = null , next = null , cur = start;
        while( cur != null ){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while( fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next;
            if( fast != null )
                fast = fast.next;
        }
        ListNode nex = slow.next;
        ListNode rev = reverseListNode(nex);
        slow.next = rev;
        ListNode p = head , q = slow.next;
        
        while( p != slow && q != null ){
            ListNode pn = p.next , qn = q.next;
            p.next = q;
            p = pn;
            q.next = p; 
            q = qn;
            
            if( q == null || q.next == null )
                p.next = q;
        }
      
        if( q == null ){
            p.next = slow;
            slow.next = null;
        }
            
        
    }
}

/*


[1,2,3,4]
[1,2,3,4,5]
[1,2,3,4,5,6,7,8]
[1,2,3,4,5,6,7,8,9]
[1,2,3,4,5,6,7,8,9,10]
[1,2,3,4,5,6,7,8,9,10,11]

*/