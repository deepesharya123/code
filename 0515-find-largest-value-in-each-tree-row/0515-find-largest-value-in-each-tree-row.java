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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while( q.size() > 0 ){
            int mx = Integer.MIN_VALUE;
            int siz = q.size();
            boolean present = false;
            for( int i = 0 ; i < siz ; i++ ){
                TreeNode node = q.poll();
                if( node == null)
                    continue;
                else
                    present = true; 
                mx = Math.max(mx, node.val);
                if( node.left != null )
                    q.add(node.left);
                if( node.right != null)
                    q.add(node.right);
            }
            if( present)
            ans.add(mx);
        }
        return ans;
    }
}