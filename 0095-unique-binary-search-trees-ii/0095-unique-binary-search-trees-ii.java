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
    
    public List<TreeNode> solve(int start, int end){
        List<TreeNode> ret = new ArrayList();
        if(start > end){
            ret.add(null);
            return ret;
        }else if( start == end){
            ret.add(new TreeNode(start));
            return ret;
        }
        for(int i = start; i <= end; i++){
            List<TreeNode> leftTrees = solve(start, i-1);
            List<TreeNode> rightTrees = solve(i+1,end);
            
            for(TreeNode lt : leftTrees){
                for(TreeNode rt: rightTrees){
                    TreeNode root = new TreeNode(i);
                    root.left = lt;
                    root.right = rt;
                    ret.add(root);
                }
            }
        }
        return ret;
    }
    
    public List<TreeNode> generateTrees(int n) {
        return solve(1,n);
    }
}