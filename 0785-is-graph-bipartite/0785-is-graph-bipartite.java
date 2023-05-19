class Solution {
    
    public boolean dfs(int[][] graph, int node, int[] color, int c){
        color[node] = c;
        int m = graph[node].length;
        boolean ret = true;
        for(int i = 0; i < m; i++){
            int nbr = graph[node][i];
            if(color[node] == color[nbr]){
                return false;
            }else if(color[nbr] == -1) {
                ret = ret& dfs(graph, nbr, color,1-c);
            }
        }
        return ret;
    }
    
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int c = 0;
        int[] color = new int[n];
        Arrays.fill(color, -1);
        boolean ans = true;
        for(int i =0 ;i < n ; i++)
            if(color[i] == -1)
                ans&=dfs(graph,i, color,c);
        return ans;
    }
}