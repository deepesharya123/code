class Solution {
    int[] dp = new int[367];
    public int solve(int ind, int[] days, int[] costs){
        if(ind == days.length)
            return 0;
        
        if(dp[ind] != -1)
            return dp[ind];
        // curDate + validDays -1
//         1 Day pass
        int a = costs[0] + solve(ind+1, days, costs);
        
//          7 Days            [ 2 3 4 5 6 7 8  ]
        int b = Integer.MAX_VALUE ;
        int ci = ind ;
        while(ci + 1 <  days.length && days[ci +1 ] - days[ind] + 1 <=7 ){
            ci++;
        }
        // System.out.println(ci+" "+ind+" "+days[ci]+" "+days[ind]);
        b = costs[1] + solve(ci + 1, days, costs );
        
//         30 days
        int c = Integer.MAX_VALUE ;
        ci = ind ;
        while(ci +1 < days.length  && days[ci +1 ] - days[ind] + 1 <= 30 ){
            ci++;
        }
        c = costs[2] + solve(ci + 1, days, costs );
        
        return dp[ind] = (int) Math.min(a,Math.min(b,c));
    }
    
    public int mincostTickets(int[] days, int[] costs) {
        Arrays.fill(dp,-1);
        return solve(0, days, costs);
    }
}

/*


[1,4,6,7,8,20]
[2,7,15]
[1,2,3,4,5,6,7,8,9,10,30,31]
[2,7,15]
[1,4,6,7,8,20]
[123,1,15]
[1,2,3,4,5,6,7,8,9,10,30,31]
[2,1,1]




*/