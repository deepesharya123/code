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
    
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
        q.add(new Pair(root, 1));
        int ans = 1;
        while(!q.isEmpty()){
            int siz = q.size();
            int first = -1, last = -1;
            while(siz-- != 0){
                TreeNode node = q.peek().getKey();
                int num = q.peek().getValue();
                q.poll();
                
                if(first == -1)
                    first = num;
                last = num;
                ans = Math.max(ans, last- first+1);
                if(node.left != null)
                    q.add(new Pair(node.left, 2* num));
                if(node.right != null)
                    q.add(new Pair(node.right, (2* num)+1));
                
            }
        }
        
        return ans;
    }
}