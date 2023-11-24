class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i = 0 , j = 0, n = piles.length;
        j = n-1;
        int ans = 0;
        while( i < j ){
            int small = piles[i++], large = piles[j--] , mid = piles[j--];
            ans+=mid;
        }
        return ans;
    }
}