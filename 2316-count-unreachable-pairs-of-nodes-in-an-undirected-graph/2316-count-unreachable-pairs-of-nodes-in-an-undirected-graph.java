class Solution {
    
    public void dfs(HashMap<Integer,List<Integer>> map, int node, int[] vis,int[] count){
        count[0]++;
        // System.out.println(count[0]);
        vis[node] = 1;
        if(!map.containsKey(node))  return;
        for(int nbr : map.get(node)){
            if(vis[nbr] == 0){
                dfs(map, nbr, vis,count);
            }
        }
        return ;
    }
    
    public long countPairs(int n, int[][] edges) {
        long ans = 0, sum = 0;
        List<Integer> list = new ArrayList<>();
        int[] count = {0};
        int[] vis = new int[n];
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < edges.length ; i++ ){
            map.putIfAbsent(edges[i][0], new ArrayList<>());
            map.get( edges[i][0] ).add( edges[i][1] );
            map.putIfAbsent(edges[i][1], new ArrayList<>());
            map.get(edges[i][1]).add(edges[i][0]);
        }
        
        for(int i=0 ; i < n ; i++){
            if(vis[i] == 0){
                dfs(map,i,vis,count);
                long add = count[0] ;
                add*=(n-count[0]);
                sum+= (add );
                count[0] = 0;
            }
        }
        sum/=2;
        return sum;
    }
}