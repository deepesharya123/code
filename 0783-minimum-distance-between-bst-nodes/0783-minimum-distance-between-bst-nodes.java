/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int dif = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<>();
    public void solve(TreeNode root, int pre){
        if(root==null)  return;
        solve(root.left,pre);
        list.add(root.val);
        
        if(list.size()==2){
            int first = list.get(0), second = list.get(1);
            dif = Math.min(dif,second-first);
            list.remove(0);
        }
       
        solve(root.right,pre);
           
                
    }
    
    public int minDiffInBST(TreeNode root) {
        int pre = -1;
        dif = Integer.MAX_VALUE;
        solve(root,pre);
        return dif;
    }
}