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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode trav = head;
        while(trav != null ){
            trav = trav.next;
            len++;
        }
        int ck = k;
        ListNode[] ans = new ListNode[k];
        int nodeind = 0;
        trav = head;
        int ind = 0;
        while(nodeind < len){
            int req = len / k;
            ListNode tempHead = trav;    
            if(ind < len % k )
                req++;
            ans[ind++] = tempHead;
            while(req > 1){
                nodeind++;
                req--;
                trav = trav.next;
            }
            nodeind++;
            ListNode tempTrav = trav;
            trav = trav.next;
            tempTrav.next = null;
        }
        return ans;   
    }
}




/*

[1,2,3]
5
[1,2,3,4,5,6,7,8,9,10]
30
[1,2,3]
2
[1,2,3,4,5,6,7,8,9,10]
3
[1,2,3,4,5,6,7,8,9,10]
1
[1,2,3,4,5,6,7,8,9,10]
2
[1,2,3,4,5,6,7,8,9,10]
4
[1,2,3,4,5,6,7,8,9,10]
5
[1,2,3,4,5,6,7,8,9,10]
6
[1,2,3,4,5,6,7,8,9,10]
7
[1,2,3,4,5,6,7,8,9,10]
8
[1,2,3,4,5,6,7,8,9,10]
9
[1,2,3,4,5,6,7,8,9,10]
10



*/