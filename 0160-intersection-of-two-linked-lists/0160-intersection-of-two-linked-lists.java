/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0,len2 = 0;
        ListNode temp = headA;
        while(temp != null){
            len1++;
            temp = temp.next;
        }
        temp = headB;
        while(temp !=null ){
            len2++;
            temp = temp.next;
        }
        ListNode ans = null;
        ListNode jump = headA;
        int dif = Math.abs(len1-len2);
        if(len2-len1>0){
            jump = headB;
            while(dif>0){
                dif--;
                jump = jump.next;
            }
            ListNode ha = headA;
            while(jump!=ha){
                jump = jump.next;
                ha = ha.next;
                if(jump == null || ha == null)
                    break;
            
            }
            if(jump==ha)    ans = ha;
        }        
        if(len1-len2>=0){
            jump = headA;
            while(dif>0){
                dif--;
                jump = jump.next;
            }
             ListNode hb = headB;
            // System.out.println(jump.val+" "+headA.val);
            while(jump!=hb){
                jump = jump.next;
                hb = hb.next;
                if(jump == null || hb == null)
                    break;
            
            }
            if(jump==hb)    ans = hb;
        }        
        System.out.println(ans!=null ? ans.val: ans);
        return ans;
    }
}