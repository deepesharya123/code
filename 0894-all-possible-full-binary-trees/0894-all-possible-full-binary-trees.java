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
    List<TreeNode> ans = new ArrayList();
    HashMap<Integer,List<TreeNode>> hm = new HashMap();
    
    public List<TreeNode> solve(int n ){
        if(n%2 == 0)
            return ans;
        
        List<TreeNode> res = new ArrayList();
        if(n == 1){
            res.add(new TreeNode(0));
            return res;
        }
        
        if(hm.containsKey(n))
            return hm.get(n);
        
        for(int i = 1; i < n;i++){
            List<TreeNode> left = solve(i);
            List<TreeNode> right = solve(n-i-1);
            
            for(TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode newNode = new TreeNode(0,l,r);
                    res.add(newNode);
                }
            }
        }
        hm.put(n,res);
        return res;
    }
    
    public List<TreeNode> allPossibleFBT(int n) {
        return solve(n);
    }
}