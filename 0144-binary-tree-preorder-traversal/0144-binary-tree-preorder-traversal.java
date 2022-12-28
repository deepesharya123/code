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
//         Iterative Approach for preorder traversal
        Stack<TreeNode> st =  new Stack<>();
        st.add(root);
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        while(st.size()>0){
            TreeNode node = st.pop();
            ans.add(node.val);
            
            if(node.right!=null)
                st.add(node.right);
            if(node.left!=null)
                st.add(node.left);
        }
        return ans;
    }
}