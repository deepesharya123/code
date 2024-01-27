class Solution {
    
    int mod = (1000000007);
    
    public int solve(int n, int k, int[][] mat){
        if( n == 0 ) 
            return 0;
        
        if( k == 0 )
            return 1;
        
        if( mat[n][k] != -1 )
            return mat[n][k] ;
        
        int ret = 0;
        for(int i = 0 ; i <= Math.min(n-1,k) ; i++ ){
            ret+=(solve(n-1,k-i,mat)%mod);
            ret%=mod;
        }
        
        mat[n][k] = ret;
        
        return ret;
    }
    
    public int kInversePairs(int n, int k) {
        int[][] mat = new int[n+2][k+2];
        for(int[] ar : mat)
            Arrays.fill(ar,-1);
        return solve(n,k,mat);
    }
}