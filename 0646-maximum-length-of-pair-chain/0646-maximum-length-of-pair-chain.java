class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        // int[] pre = {pairs[0] , pairs[1]};
        int ans = 0;
        
        for(int i = 0 ; i < pairs.length ; i++){
            int[] pre = pairs[i];
            int temp = 1;
            for(int j = i + 1 ; j < pairs.length ; j++){
                int[] cur = pairs[j];
                if(cur[0] > pre[1]){
                    temp++;
                    pre = cur;
                }
            }
            ans = Math.max(ans, temp);
        }
        
        return ans;
    }
}