class Solution {
    public int maxDistance(int[][] grid) {
        int n = grid.length, i=0,j=0;
        Queue<Pair<Integer,Pair<Integer,Integer>>> q = new LinkedList<>();
        int[][] vis = new int[n][n];
        int[][] ans = new int[n][n];
        for(i=0;i<n;i++){
            Arrays.fill(ans[i],-1);
            for(j=0;j<n;j++)
                if(grid[i][j]==1){
                    q.add(new Pair(0,new Pair(i,j)));
                    vis[i][j]=1;
                }
        }
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        while(!q.isEmpty()){
            int dis = q.peek().getKey();
            int r = q.peek().getValue().getKey();
            int c = q.peek().getValue().getValue();
            q.poll();
            
            for(i=0;i<4;i++){
                int nr = r+dr[i];
                int nc = c+dc[i];
                
                if(nr>=0 &&nr<n && nc>=0 && nc<n && vis[nr][nc]==0){
                    if(grid[nr][nc]==0){
                        ans[nr][nc] = Math.max(ans[nr][nc],dis+1);        
                    }
                    vis[nr][nc]=1;
                    q.add(new Pair(dis+1,new Pair(nr,nc)));
                }
            }
        }
        int ret = Integer.MAX_VALUE;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(ans[i][j]!=-1){
                    if(ret == Integer.MAX_VALUE)    ret = ans[i][j];
                    else    ret = Math.max(ret,ans[i][j]);
                }
            }
        }
        
        return ret==Integer.MAX_VALUE?-1:ret;
    }
}