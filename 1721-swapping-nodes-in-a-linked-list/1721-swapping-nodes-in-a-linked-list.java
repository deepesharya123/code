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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left = head, start = head , copyLeft = left ;
        int ck = k;
//         traversed first k nodes out of n
        while( ck-- != 1){
            left = left.next;
            copyLeft = left;                            
        }
        
//         traversed remanining n-k nodes ,so Time Complexity = O(n)
        while( left.next!=null){
            start = start.next;
            left = left.next;
        }
        int temp = copyLeft.val;
        copyLeft.val = start.val;
        start.val = temp;
        return head;
    }
}