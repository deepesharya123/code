class Solution {
    public static int[] post(int node, int par, char[] label,
        List<List<Integer>> adj,char c,int[] ans){
        
        int[] child = new int[26];
        
        child[label[node]-'a']=1;
        for(int it: adj.get(node)){
            if(it!=par){
                int temp[] = post(it, node, label, adj,label[it],ans);
                for(int i = 0;i<26;i++){
                    child[i]+=temp[i];
                }
            }
        }
            
        ans[node] = child[label[node]-'a'];
        return child;
    }
    
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        List<List<Integer>> adj = new ArrayList<>();
        
        int i = 0;
        for(i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
        int[] ans = new int[n];
 
        char[] label = labels.toCharArray();
        post(0,-1,label, adj,label[0],ans);
        
        return ans;
    }
}