/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head!=null && head.next!=null && head.next==head)  return head;
        ListNode slow = head, fast = head, helper = head;
        while( fast != null && fast.next!=null ){
            ListNode nextSlow = slow.next;
            ListNode nextFast = fast.next.next;
            slow = nextSlow;
            fast = nextFast;
            if(slow==fast){
                while(helper!=slow){
                    helper = helper.next;
                    slow = slow.next;
                }
                return helper;
            }
            
        }
        return null;
    }
}

