class Solution {
    static int time = 0;

    public static void bfs(int[][] cg,
    Queue<Pair<Pair<Integer,Integer>,Integer>> q,int[] dr,int[] dc){
        Pair p = q.poll();
        Pair pp =(Pair) p.getKey();
        int r = (int) pp.getKey(); 
        int c= (int) pp.getValue(); 
        int t = (int) p.getValue();
         int n = cg.length,m = cg[0].length;
        int i = 0;
        for(i=0;i<4;i++){
            int nr = r+ dr[i];
            int nc = c+dc[i];
            if(nr<n && nr>=0 && nc<m && nc>=0 && cg[nr][nc]==1){
                cg[nr][nc]=2;
                time = Math.max(time,t+1);
                System.out.println("TIme"+time);
                q.add(new Pair(new Pair(nr,nc),t+1));   
            }

        }

        return ;
    }

    public int orangesRotting(int[][] grid) {
        Queue<Pair<Pair<Integer,Integer>,Integer>> q = new LinkedList();
        int n = grid.length,m = grid[0].length;
        int[][] cg = new int[n][m];
        int  i=0,j=0;
        time = 0;
        int[] dr = {1,0,-1,0};
        int[] dc = {0,1,0,-1};
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                cg[i][j]=grid[i][j];
                if(grid[i][j]==2){
                    q.add(new Pair(new Pair(i,j),0));         
                }
            }
        }
        while(q.size()>0)
            bfs(cg,q,dr,dc);
        
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(cg[i][j]==1)
                    time = -1;
            }
        }
        return time;
    }
}