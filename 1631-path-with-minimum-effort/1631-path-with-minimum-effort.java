class Solution {
    
    class Tuple{
        int effort;
        int row;
        int col;
        
        public Tuple(int e, int r, int c){
            effort = e;
            row = r;
            col = c;
        }
    }
    
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Tuple> min_heap = new PriorityQueue<>((a,b) -> a.effort - b.effort);
        min_heap.add(new Tuple(0,0,0));
        
        int n = heights.length, m = heights[0].length;
        int[][] ans = new int[n][m];
        for(int[] ar : ans)
            Arrays.fill(ar , Integer.MAX_VALUE);
        ans[0][0] = 0;
        
        int[] dr = {-1,0,1,0,-1};
        
        while( !min_heap.isEmpty() ){
            int effort = min_heap.peek().effort;
            int row = min_heap.peek().row;
            int col = min_heap.peek().col;
            
            min_heap.poll();
            
            for(int i = 0 ; i < 4 ; i++){
                int nr = row + dr[i];
                int nc = col + dr[i+1];
                
                if( nr >= 0 && nr < n && nc >= 0 && nc < m ){
                    int e = Math.abs(heights[nr][nc] - heights[row][col]);
                    int newEffort = Math.max(e, effort);
                    if( newEffort < ans[nr][nc] ){
                        ans[nr][nc] = newEffort;
                        min_heap.add(new Tuple(newEffort, nr, nc));
                    }
                }
            }
            
            
        }
        
        return ans[n-1][m-1];
    }
}