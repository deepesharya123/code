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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)  return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Integer> subList = new ArrayList<>();
        int siz = q.size();
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if( siz > 1 ){
                subList.add(node.val);
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);

                siz--;
            }else{
                subList.add(node.val);
                ans.add(new ArrayList<>(subList));
                subList.clear();
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
                siz = q.size();
            }
        }
        return ans;
    }
}