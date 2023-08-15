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
    public ListNode partition(ListNode head, int x) {
        ListNode left = null, right = null, temp = head;
        ListNode leftHead = null, rightHead = null;
        while(temp != null){
            if(temp.val < x){
                if(leftHead == null){
                    left = temp;
                    leftHead = temp;
                }else{
                    left.next = temp;
                    left = left.next;
                }
            }else{
                if(rightHead == null){
                    right = temp;
                    rightHead = right;
                }else{
                    right.next = temp;
                    right = right.next;
                }
            }
            temp = temp.next;
        }
        
        if(left != null)
            left.next = null ;
        if(right != null)
            right.next = null;
        if(left != null)
            left.next = rightHead;
        else
            return rightHead;
        return leftHead;
        
    }
}