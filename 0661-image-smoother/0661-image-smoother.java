class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] drc = {{0,0}, {-1,0}, {-1,1 } , {0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}  };
        int n = img.length , m = img[0].length;
        int[][] ans = new int[n][m];
        
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < m ; j++ ){
                int sum = 0 ,count = 0;
                for(int k = 0 ; k < 9 ; k++ ){
                    int nr = drc[k][0] + i , nc = drc[k][1] + j;
                    if( nr >=0 && nr < n && nc >=0 && nc < m ){
                        count++;
                        sum+=img[nr][nc];
                    }
                }
                // System.out.println(i+" "+j+" "+sum+" "+count);
                ans[i][j] =(int) Math.round(sum/count);
            }
        }
        
        return ans;
    }
}