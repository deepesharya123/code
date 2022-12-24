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
    static int ans = 0;
    
    public static void preorder(TreeNode root, int height){
        if(root==null){
            ans = Math.max(ans,height);
            return;
        }
        preorder(root.left,height+1);
        preorder(root.right,height+1);
        
    }
    
    public int maxDepth(TreeNode root) {
        ans = 0;
        preorder(root,0);
        return ans;
    }
}