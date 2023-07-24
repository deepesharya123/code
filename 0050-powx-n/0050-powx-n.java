class Solution {
    
    public double pow(double x, int n){
        if(n == 1)
            return x;
        if(n == 0 )
            return 1;
        
        double half = pow(x,n/2); 
        if(n%2 == 0)
            return half*half;
            
        return half*half*x;
    }
    
    public double myPow(double x, int n) {
        double ans = 1.0;
        if(n < 0){
            ans = ans/x;
            n*=-1;
        }
        else
            ans = x;
        return pow(ans,n);
    }
}