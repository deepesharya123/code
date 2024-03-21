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
    // Iterative solution
/*    public static ListNode reverse(ListNode head){
        ListNode cur = head,pre= null,ne = head.next;
        while(cur!=null){
            cur.next = pre;
            pre = cur;
            cur = ne;
            if(ne!=null)
            ne = ne.next;
        }
        return pre;
    }
*/
    // Recursive solution
    public static ListNode reverse(ListNode head){
        if(head==null|| head.next==null)    
            return head;
        
        ListNode temp = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return temp;

    }

    public ListNode reverseList(ListNode head) {
        if(head==null|| head.next==null)
            return head;

        return reverse(head);
        
    }
}