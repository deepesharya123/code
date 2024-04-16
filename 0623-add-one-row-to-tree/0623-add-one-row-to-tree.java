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
    
    public void solve(TreeNode root, int val, int depth ){
        // System.out.println(root.val +" "+depth);
        if( depth == 2 ){
            TreeNode leftNode = new TreeNode(val);
            TreeNode rightNode = new TreeNode(val);
            
            TreeNode leftRoot = root.left;
            TreeNode rightRoot = root.right;
            
            root.left = leftNode;
            leftNode.left = leftRoot;
            
            root.right = rightNode;
            rightNode.right = rightRoot;
            return;
        }
        if( root.left != null )
            solve(root.left , val , depth - 1);
        if( root.right != null )
            solve(root.right , val , depth - 1);
        
    }
    
    
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if( depth == 1 ){
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }
            
        solve(root, val , depth);
        return root;
    }
}

/*
[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
100
2
[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
100
3
[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
100
4
[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
100
5
[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
100
1

*/