class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void dfs(int src, int[][] graph, int [] vis, List<Integer> temp ){
        int dest = graph.length-1;
        if(src==dest){
            ans.add(new ArrayList<>(temp));
            return;
        }
        vis[src] =1; 
        for(int i = 0;i<graph[src].length;i++){
            int node = graph[src][i];
            if(vis[node]==0){
                temp.add(node);
                dfs(node,graph,vis,temp);
                temp.remove(temp.indexOf(node));
                vis[node]=0;
            }
        }
        
    } 
        
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        int[] vis = new int[graph.length];
        
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        dfs(0,graph, vis,temp);    
        return ans;
    }
}