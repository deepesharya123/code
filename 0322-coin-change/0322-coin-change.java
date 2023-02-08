class Solution {
//     int[][] dp = new int[10004][14];
//     public int solve(int[] coins,int amount, int ind){
        
//         if(amount ==0 )
//             return 0;
//         if(amount<0 || ind==0 )
//             return -1;
        
//         if(dp[amount][ind]!=-1)
//             return dp[amount][ind];
        
//         int desc = solve(coins,amount,ind-1);
//         int inc = solve(coins,amount-coins[ind-1],ind);
//         if(inc>=0)
//             inc++;
        
//         if(inc<0 && desc<0)
//             dp[amount][ind]=-1;
//         else if(inc>=0 && desc>=0)
//             dp[amount][ind]=Math.min(inc,desc);
//         else
//             dp[amount][ind]=Math.max(inc,desc);
        
//         return dp[amount][ind];
            
//     }
    
//     public int coinChange(int[] coins, int amount) {
//         for(int i=0;i<10004;i++){
//             Arrays.fill(dp[i],-1);
//         }
//         int ans= solve(coins,amount,coins.length);
// //         for(int i =0;i<10004;i++){
// //             for(int a: dp[i])
// //                 System.out.print(a+" ");
// //                 System.out.println();
            
// //         }
//         return ans;
//     } 
    
    public int coinChange(int[] coins, int amount) {
//         dp[i][j] = i= amount , j=  ind
        int[][] dp = new int[amount+4][14];
        int i =0,j=0;
        for(i=0;i<14;i++)
            dp[0][i]=0;
         
        for(i=0;i<amount+4;i++)
            dp[i][0]=-1;
        
        for(i=1;i<amount+1;i++){
            for(j=1;j<coins.length+1;j++){
                int desc = dp[i][j-1];
                int inc = -1;
                if(i-coins[j-1]>=0)
                    inc = dp[i-coins[j-1]][j];
                
                if(inc>=0)  inc++;
                    dp[i][j] = -1;
                if(inc>=0 && desc>=0)
                    dp[i][j]=Math.min(inc,desc);
                else
                    dp[i][j]=Math.max(inc,desc);   
            }
        }
        return dp[amount][coins.length];
    
    }
    
}

/*

[1,2,5]
11
[2]
3
[1]
0
[2,4,6,7,8,9,10,12,14,15,17,19]
46

*/