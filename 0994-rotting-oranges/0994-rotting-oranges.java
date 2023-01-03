class Solution {
    static int ans = 0;
    
    
    public int orangesRotting(int[][] grid) {
        ans = 0;
        int i =0,j=0;
        Queue<Pair<Integer,Pair<Integer,Integer>>> q = new LinkedList<>();
        for(i=0;i<grid.length;i++)
            for(j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i, new Pair(j,0)));            
                }
            }
        
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        int n = grid.length, m = grid[0].length;
        while(!q.isEmpty()){
            int r = q.peek().getKey();
            int c = q.peek().getValue().getKey();
            int t = q.peek().getValue().getValue();
            
            q.remove();
            
            ans = Math.max(t,ans);
            for(i = 0;i<4;i++){
                int nr = r + dr[i];
                int nc = c + dc[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1){
                    q.add(new Pair(nr, new Pair(nc, t+1)));
                    grid[nr][nc]=2;
                }
            }
            
        }
        
        for(i=0;i<grid.length;i++)
            for(j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    ans=-1;
                    break;
                }
            }
        
        return ans;
    }
}
