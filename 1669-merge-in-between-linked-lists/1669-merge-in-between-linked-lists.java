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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode();
        dummy.next = list1;
        ListNode prea = dummy , preb = dummy , nexb = null, trav = dummy;
        int i = 0;
        while( trav != null ){
            
            ListNode cur = trav , nex = trav.next;
            if( i == a ){
                prea = cur;
            }
            if(i ==  b ){
                preb = cur;
                nexb = nex.next;
                break;
            }
            i++;
            trav = trav.next;
        }
        System.out.println(prea.val);
        ListNode end = list2;
        while( end.next != null )
            end = end.next;
        
        prea.next = list2;
        end.next = nexb;
        return dummy.next;
    }
}