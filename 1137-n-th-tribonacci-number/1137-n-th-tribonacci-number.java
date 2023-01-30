class Solution {
    
    public int solve(long[] pre, int n,int i){
        if(n<3)
            return (int)pre[n];
        
        
        long sum = pre[0]+pre[1]+pre[2];
        
        
        if(i==n)
            return (int)sum;
        
        pre[0]=pre[1];
        pre[1]=pre[2];
        pre[2]=sum;
        return solve(pre,n,i+1);
        
    }
    
    
    public int tribonacci(int n) {
        long[] pre = new long[3];
        pre[0]=0;
        pre[1] = pre[2] = 1;
        return (int) solve(pre, n,3);
    }
}