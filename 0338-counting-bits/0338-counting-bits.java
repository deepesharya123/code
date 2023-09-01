class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0 ; i <= n; i++){
            int temp = 0, j = i;
            while(j > 0){
                if( ( j & 1 )== 1)
                    temp++;
                j = j>>1;
            }
            ans[i] = temp;
        }
        return ans;
    }
}