class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] indegree = new int[n];
        int[][] connected = new int[n][n];
        
        for(int[] ar : roads){
            int u = ar[0] , v = ar[1];
            connected[u][v] = 1;
            connected[v][u] = 1;
            indegree[u]++;
            indegree[v]++;
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n ;j++){
                if(i == j)
                    continue;
                ans = Math.max(ans, indegree[i] + indegree[j] - connected[i][j]);
            }
        }
        
        return ans;
    }
}