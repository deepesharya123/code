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
    public List<Integer> preorderTraversal(TreeNode root) {
//      Morris traversal
        TreeNode cur = root;
        List<Integer> ans=  new ArrayList<>();
        while(cur!=null){
            if(cur.left==null){
                TreeNode temp = cur;
                ans.add(cur.val);
                cur = cur.right;
                
                // System.out.println("id "+temp.val+" "+cur.val);
            }else{
                TreeNode right_most_node = cur.left;
                while(right_most_node.right!=null && right_most_node.right!=cur)
                    right_most_node = right_most_node.right;
                
                
                if(right_most_node.right==null){
                    ans.add(cur.val);
                    right_most_node.right = cur;
                    cur = cur.left;
                
                }else{
                    cur = cur.right;
                    right_most_node.right = null; 
                }
            }
        }
        return ans;
    }
}