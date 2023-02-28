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
    
    public String inorder(TreeNode root, HashMap<String,Integer> map,List<TreeNode> ans){
        if(root==null)  return "";
                
        String left = inorder(root.left,map,ans);
        left="("+left+")";
        left+=root.val;
        
        String right = inorder(root.right,map,ans);
        right="("+right+")";
        String main = ""+left+right;
        
        map.put(main,map.getOrDefault(main,0)+1);
        if(map.get(main)==2)
            ans.add(root);
        
        return main;
    }
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        List<TreeNode> list = new ArrayList<>();
        inorder(root,new HashMap<>(),list);
        return list;
    }
}





/*

[0,0,0,0,null,null,0,0,0,0,0]
[0,0,0,0,null,null,0,null,null,null,0]
[1,2,3,4,null,2,4,null,null,4]
[2,2,2,3,null,3,null]
[2,1,1]
[1]



*/