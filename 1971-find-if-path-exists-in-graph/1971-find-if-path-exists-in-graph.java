class Solution {
    
    public static void dfs(int src,List<List<Integer>> adj,int[] vis){
        vis[src]=1;
        
        for(int i =0;i<adj.get(src).size();i++){
            int num = adj.get(src).get(i);
            if(vis[num]==0){
                dfs(num,adj,vis);
            }
        }
    }
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int[] vis = new int[n];
        List<List<Integer>> adj = new ArrayList<>();
        int i = 0,j=0;
        for(i=0;i<n;i++)
                adj.add(i,new ArrayList<Integer>());
        
        for(i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        dfs(source,adj,vis);
        return vis[destination]==1 ? true : false;
    }
}