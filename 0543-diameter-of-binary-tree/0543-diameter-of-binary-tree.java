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
    
    int ans = Integer.MIN_VALUE;
    
    public int solve(TreeNode root){
        int ret = 0;
        if( root == null )
            return ret;
        
        int lef = solve(root.left);
        int rig = solve(root.right);

        ans = Math.max(ans, lef + rig );
        ret = Math.max(lef, rig);
        ret++;
        
        return ret;
        
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return ans;
    }
}