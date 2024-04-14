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
    
    public int solve(TreeNode root ){
        if( root == null )
            return 0;
        
        int add = 0;
        if( root.left != null && root.left.left == null && root.left.right == null )
            add += root.left.val;
        
        add += solve(root.left);
        add += solve(root.right);
        
        return add;
        
    }
        
    
    public int sumOfLeftLeaves(TreeNode root) {
        return solve(root);
    }
}