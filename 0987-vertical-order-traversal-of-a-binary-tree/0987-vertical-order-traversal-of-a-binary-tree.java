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
    static TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> tm = new TreeMap<>();
    static List<List<Integer>> ans = new ArrayList<>();
    
    public static void preorder(TreeNode root,int x, int y){
        if(root==null)
            return;
        
        if(!tm.containsKey(x))
            tm.put(x,new TreeMap<>());
        
        if(!tm.get(x).containsKey(y))
            tm.get(x).put(y,new PriorityQueue<>());
        
        tm.get(x).get(y).offer(root.val);
        preorder(root.left,x-1,y+1);
        preorder(root.right,x+1,y+1);
        return;
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        tm.clear();
        ans.clear();
        preorder(root,0,0);
        for(TreeMap<Integer,PriorityQueue<Integer>> it: tm.values()){
            List<Integer> subList = new ArrayList<>();
            for(PriorityQueue<Integer> values : it.values()){
                while(values.size()>0){
                    subList.add(values.remove());
                }
            }
            ans.add(subList);
        }
        return ans;
        
    }
}