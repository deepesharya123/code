class Solution {
    public int solve(int ind, int[] cookies, int k, int zeros,int[] temp, int max){
        int n = cookies.length;
        if(n - ind < zeros)
            return Integer.MAX_VALUE;
        
        if(ind == n ){
            int ret = zeros == 0 ? max : Integer.MAX_VALUE;
            // for(int val : temp)
            //     ret = Math.max(val, ret);
            return ret;
        }
        
        int ret = Integer.MAX_VALUE;
        for( int i = 0; i < k ; i++ ){
            zeros-= temp[i] == 0 ? 1 : 0;
            temp[i]+=cookies[ind];
            ret = Math.min(solve(ind+1, cookies, k, zeros, temp, Math.max(max, temp[i]) != Integer.MAX_VALUE ? Math.max(max, temp[i])  : max ), ret);
            temp[i]-=cookies[ind];
            zeros+=temp[i] == 0 ? 1 : 0;
        }
        return ret;
    }
    
    public int distributeCookies(int[] cookies, int k) {
        int[] temp = new int[k];
        return solve(0, cookies, k, k , temp, 0);
    }
}