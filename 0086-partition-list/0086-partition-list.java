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
        ListNode ret = null, trav = head, temp = null;
//         sotring all the smaller values first
        while(trav != null){
            if(trav.val < x){
                ListNode newNode = new ListNode(trav.val);
                if(ret == null){
                    ret = newNode;
                    temp = newNode;
                }else{
                    temp.next = newNode;
                    temp = newNode;
                }
            }
            trav = trav.next;
        }
//         storing all values greater than or equal to x
        trav = head;
        while(trav != null){
            if(trav.val >= x){
                ListNode newNode = new ListNode(trav.val);
                if(ret == null ){
                    ret = newNode;
                    temp = newNode;
                }else{
                    temp.next = newNode;
                    temp = newNode;
                }
            }
            trav = trav.next;
        }
        return ret;
    }
}