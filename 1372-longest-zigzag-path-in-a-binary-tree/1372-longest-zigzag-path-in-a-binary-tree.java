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
    int ans = 0;
    public void dfs(TreeNode root, int dir, int moves){
        if(root == null)
            return ;
        
        ans = Math.max(moves, ans);
        
        if(dir == 1){
            dfs(root.right, -1 * dir, moves+1);
            dfs(root.left, 1, 1);
        }else{
            dfs(root.left, -1 * dir, moves+1);
            dfs(root.right, -1, 1);            
        }
        
    }
    
    public int longestZigZag(TreeNode root) {
        ans = 0;
        dfs(root, 1, 0);
        dfs(root,-1, 0);
        return ans;
    }
}