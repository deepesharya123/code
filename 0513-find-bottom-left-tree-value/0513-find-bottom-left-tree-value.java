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
    public int findBottomLeftValue(TreeNode root) {
        int ans = root.val;
        Queue<List<TreeNode>> queue = new LinkedList<>();
        List<TreeNode> first = new ArrayList<>();
        first.add(root);
        queue.offer(first);
        
        while( !queue.isEmpty() ){
            List<TreeNode> nodes = queue.poll();
            List<TreeNode> newNodes = new ArrayList<>();
            for(int i = 0 ; i < nodes.size() ; i++ ){
                TreeNode node = nodes.get(i);
                if( i == 0 ){
                    ans = node.val;
                }
                if( node.left != null )
                    newNodes.add(node.left);
                if( node.right != null )
                    newNodes.add(node.right);
            }
            if( newNodes.size() > 0  )
            queue.add(newNodes);
        }
        return ans;
    }
}