class Solution {
    public int bulbSwitch(int n) {
        int ans = 0;
        if(n == 0) return n;
        for(int i = 1; i <= 100000 ; i++){
            long square = i;
            square*= i;
            if(square > n)
                break;
            ans++;
        }
        return ans;
    }
}