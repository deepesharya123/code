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
     public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder==null || postorder ==null || (inorder.length!=postorder.length)){
            return null;
        }
        HashMap<Integer,Integer> map = new HashMap();
        for (int i=0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }
        return helperBuildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
    }

    private static TreeNode helperBuildTree(int[] inorder, int inorderStart, int inorderEnd, int[] postorder, int postorderStart, int postorderEnd, HashMap<Integer, Integer> map) {
        if ((inorderStart>inorderEnd)||(postorderStart>postorderEnd)){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorderEnd]);

        int posOfRootInInorder = map.get(postorder[postorderEnd]);
        int numLiftInInorder = posOfRootInInorder-inorderStart;

        root.left=helperBuildTree(inorder,inorderStart,posOfRootInInorder-1,postorder,postorderStart,postorderStart+numLiftInInorder-1,map);
        root.right=helperBuildTree(inorder,posOfRootInInorder+1,inorderEnd,postorder,postorderStart+numLiftInInorder,postorderEnd-1,map);

        return root;
    }
  
}