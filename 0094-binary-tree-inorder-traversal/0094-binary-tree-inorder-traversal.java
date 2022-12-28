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
    public List<Integer> inorderTraversal(TreeNode root) {
//         Iterative solution for inorder traversal
        Stack<TreeNode> st = new Stack<>();
        List<Integer> l = new ArrayList<>();
        if(root==null)
            return l;
        st.push(root);
        TreeNode cur = root.left;
        while(st.size()>0){
            TreeNode node = st.peek();
            
            if(cur==null){
                st.pop();
                l.add(node.val);
                if(node.right!=null){
                    st.add(node.right);
                    cur=node.right.left;
                }
            }else{
                st.add(cur);
                cur=cur.left;
            }
            
            
            
            
        }
        return l;
    }
}