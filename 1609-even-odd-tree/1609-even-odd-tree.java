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
    
    public boolean dfs(int level, HashMap<Integer,Integer> map, TreeNode root){
        // base case
        if( root.left == null && root.right == null ){
            if( !map.containsKey(level) ){
                if( level % 2 == root.val % 2 ) 
                    return false;
                map.put(level, root.val);
                return true;    
            }
            
            int val = root.val, comp = map.get(level);
            if( level % 2 == 0 ){
                
                if( val % 2 == 1 && val > comp ){
                    map.put(level, val);
                    return true;
                }    
                
            }else{
                
                if( val % 2 == 0 && val < comp ){
                    map.put(level, val);
                    return true;
                }
                
            }
            
            return false;
        }
        
        boolean ret = true;
        if( !map.containsKey(level) ){
            if( level % 2 == root.val % 2 ) 
                return false;
            map.put(level, root.val);
            if( root.left != null )
                ret = ret && dfs(level+1 , map , root.left );

            if( ret && root.right != null )
                ret = ret && dfs(level+1 , map , root.right );
        }else{
            int val = root.val, comp = map.get(level);
            if( level % 2 == 0 ){
                if( val % 2 == 1 && val > comp )
                    map.put(level, val);
                else
                    return false;
            }else{
                
                if( val % 2 == 0 && val < comp )
                    map.put(level, val);
                else
                    return false;
            }
            
            if( root.left != null )
                ret = ret && dfs(level+1 , map , root.left );
            if( ret && root.right != null )
                ret = ret && dfs(level+1 , map , root.right );
            
        }
        return ret;
    }
    
    public boolean isEvenOddTree(TreeNode root) {
//         level, last Integer tackled at that level
        HashMap<Integer,Integer> map = new HashMap<>();
        if( root.val % 2 == 0 )
            return false;
        return dfs(0, map, root);
    }
}

/*


[1,10,4,3,null,7,9,12,8,6,null,null,2]
[5,4,2,3,3,7]
[5,9,1,3,5,7]
[1,4,2]
[5,9,1]
[2,12,8,5,9,null,null,18,16]
[11,18,14,3,7,null,null,null,null,18,null,6]



*/