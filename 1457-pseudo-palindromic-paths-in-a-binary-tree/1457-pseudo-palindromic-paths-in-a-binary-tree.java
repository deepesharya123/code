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
    
    int ans = 0 ;
    
    public boolean isPalindrome(int[] count){
        int odd = 0;
        for(int num : count ){
            // System.out.print(num+" ");
            odd+=num%2;
        }
        
        return odd < 2;
    }
    
    public void preOrder(TreeNode root, int[] count){
        if( root == null ){
            return;
        }
        int val = root.val;
        count[val]++;
        if( root.left == null && root.right == null ){
            if( isPalindrome(count))
                ans++;
        }
        preOrder(root.left, count);
        preOrder(root.right, count);
        
        count[val]--;
        return;
    }
    
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] count = new int[10];
        preOrder(root, count);
        return ans;
    }
}