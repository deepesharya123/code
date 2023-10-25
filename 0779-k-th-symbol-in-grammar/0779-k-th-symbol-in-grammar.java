class Solution {
    
    public int solve(int n,int k ){
        if( n == 1)
            return 0;

        int len = (int)Math.pow(2, n-1);
        int h = len/2;
        if( k > h )
            return 1 - solve(n,k-h);
        return   solve(n-1, k);
    }
    
    public int kthGrammar(int n, int k) {
        
        return solve(n,k);
    }
}