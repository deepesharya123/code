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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean left_to_right = true;
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)  return ans;
        q.offer(root);

        while(!q.isEmpty()){
            int si = q.size();
            List<Integer> subList = new ArrayList<>();
            for(int i = 0;i<si;i++){
                TreeNode node = q.poll();
                if(left_to_right){
                    subList.add(node.val);
                    if(node.left!=null)
                        q.add(node.left);
                    if(node.right!=null)
                        q.add(node.right);
                }else{
                    subList.add(0,node.val);
                    if(node.left!=null)
                        q.add(node.left);
                    if(node.right!=null)
                        q.add(node.right);
                }
            }
            ans.add(new ArrayList<>(subList));
            left_to_right =!left_to_right;
        }


        return ans;

    }
}