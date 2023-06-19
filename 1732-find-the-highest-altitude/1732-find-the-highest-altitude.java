class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0, sum = 0;
        for(int num : gain){
            sum+=num;
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}