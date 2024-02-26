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
    
    public boolean solve(TreeNode p, TreeNode q ){
        if( (p == null && q == p) || ( p != null && q != null && p.val == q.val && solve(p.left,q.left) && solve(p.right, q.right) ) )
            return true;
        return false;
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return solve(p,q);
    }
}