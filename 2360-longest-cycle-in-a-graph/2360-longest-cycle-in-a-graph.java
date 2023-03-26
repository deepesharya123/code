class Solution {
    int ans = -1;
    
    public void dfs(int node ,int[] vis,  int[] edges,HashMap<Integer,Integer> map){
        vis[node] = 1;

        if(edges[node] != -1 && vis[edges[node]] == 0 ){
            map.put(edges[node], map.get(node)+1);
            dfs(edges[node] , vis, edges,map );                
        }else if(edges[node] != -1 && map.containsKey(edges[node])){
            ans = Math.max(ans, map.get(node) - map.get(edges[node]) +1);
        }
        
        
    }
    
    public int longestCycle(int[] edges) {
        int n = edges.length;
        int[] vis = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(vis[i] == 0){
                HashMap<Integer,Integer> map = new HashMap<>();
                map.put(i,1);
                dfs(i, vis, edges, map);
            }    
        }
        return ans;
        
    }
}