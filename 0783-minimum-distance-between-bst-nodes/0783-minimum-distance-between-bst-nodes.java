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
    List<Integer> list=  new ArrayList<>();
    public void solve(TreeNode root){
        if(root==null) return;

        solve(root.left);
        list.add(root.val);
        solve(root.right);
        
    }
    
    public int minDiffInBST(TreeNode root) {
        int dif = Integer.MAX_VALUE;
        solve(root);
        for(int i = 0;i<list.size()-1;i++){
            int n = list.get(i), m = list.get(i+1);
            dif = Math.min(dif,m-n);    
        }
        
        return dif;
        
    }
}