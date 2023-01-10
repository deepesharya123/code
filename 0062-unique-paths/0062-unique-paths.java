class Solution {
    static double fact(int n){
        if(n<2)
            return 1;
        return n*fact(n-1);
    }
    public int uniquePaths(int m, int n) {
        double ans = 0;
            
        int cm = Math.max(m,n), cn = Math.min(m,n);
        cm--;
        cn--;
        ans = fact(cn+cm);
        System.out.println(ans);
        ans/=fact(cn);
        System.out.println(ans);
        ans/=fact(cm);
        System.out.println(ans);
        int ret = (int) Math.round(ans);
        return ret;
    }
}