class Solution {
    
    int[][] dp ;
    
    public boolean solve(int[] flower, int ind, int target){
        int n = flower.length;
        
        if(ind >= n || target<= 0){
            return target <= 0;
        }
        
        if(dp[ind][target] != -1)
            return dp[ind][target] == 1;
        
        
        boolean ret = false;
//        if current element is already one
        boolean alreadyOne = false;
        boolean currentMakeOne = false, currentMakeNotOne = false;
        
        if(flower[ind] == 1)
            alreadyOne = solve(flower, ind+1, target);
        
        if(flower[ind] == 0 ){
            if( ( ind-1 < 0 || flower[ind-1] == 0) &&  ( ind+1 >=n || flower[ind+1] == 0) ){
                
                flower[ind] = 1;
                currentMakeOne = solve(flower, ind+1, target-1);
                flower[ind] = 0;
            }
            currentMakeNotOne = solve(flower, ind+1, target);
        }
        
        boolean ans = ret | alreadyOne | currentMakeOne | currentMakeNotOne;
        dp[ind][target] = ans ? 1: 0;
        return ans;
    }
    
    public boolean canPlaceFlowers(int[] flower, int n) {
        dp = new int[flower.length+2][n+1];
        for(int[] ar : dp)
            Arrays.fill(ar,-1);
        return solve(flower,  0, n);    
    }
}



/*


[0,1,0,0,0,0,1,0,0]
2
[1,0,0,0,1]
1
[1,0,0,0,1]
2
[1,0,0,0,1]
3
[0,1,0,0,0,0,1,0,0]
1
[0,1,0,0,0,0,1,0,0]
2
[0,1,0,0,0,0,1,0,0]
3
[0,1,0,0,0,0,1,0,0]
4
[0,1,0,0,0,0,1,0,0]
5
[0,0,1,0,1]
1



*/