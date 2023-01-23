class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] br = new int[n+1];
        int[] ar = new int[n+1];
        int i = 0,ans = -1;
        for(i=0;i<trust.length;i++){
            br[trust[i][1]]++;
            ar[trust[i][0]]++;
        }
        for(i=1;i<n+1;i++){
            if(br[i]==n-1 && ar[i]==0){
                ans = i;
            }
        }
        return ans ;
    }
}
