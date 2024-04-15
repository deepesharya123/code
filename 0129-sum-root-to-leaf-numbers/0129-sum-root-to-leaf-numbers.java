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
    
    public int solve(TreeNode root, String num ){
        if( root.left == null && root.right == null )
            return Integer.parseInt(num);
        
        int add = 0 ;
        if( root.left != null )
            add += solve(root.left, num+root.left.val);
        if( root.right != null )
            add += solve(root.right, num+root.right.val);
        
        return add;
        
    }
    
    public int sumNumbers(TreeNode root) {
        return solve(root,""+root.val);
    }
}