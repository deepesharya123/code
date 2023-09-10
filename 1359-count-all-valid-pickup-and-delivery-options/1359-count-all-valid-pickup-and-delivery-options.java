class Solution {
    public int countOrders(int n) {
        int[] ans = new int[n+1];
        ans[1] = 1;
        int mod = (int)(1e9);
        mod+=7;
        for(int i = 2 ; i  < n+1 ; i++){
            int temp = 2*i;
            temp--;
            int add = (temp * (temp+1))/2 ;
            long st = ans[i-1] ;
            st*=add;
            st%=mod;
            ans[i] = (int)st;
        }        
        return ans[n];
    }
}