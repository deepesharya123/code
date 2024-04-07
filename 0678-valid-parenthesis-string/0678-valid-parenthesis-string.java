class Solution {
    
    int[][] dp = new int[103][103];
    
    public boolean solve(String s, int ind , String cur,int open){
        int n = s.length() ;
        if( ind >= n ){
            return open == 0;
        }
        
        if( dp[ind][open] != -1 )
            return ( dp[ind][open] == 1);
        
        char c = s.charAt(ind);
        boolean ret = false;
        
        if( c != '*' ){
            if( c == '(')
                ret |= solve(s, ind+1, cur +"(", open + 1 );
            else if( open > 0 )
                ret |= solve(s, ind+1, cur +")", open - 1 );
                
        }else{
            
//             keep the cur same 
            ret |= solve(s, ind+1, cur,open);
            
//             add '(' in cur
            ret |= solve(s, ind+1, cur+"(",open+1);

//             add ')' in cur
            if(open > 0)
                ret |= solve(s, ind+1, cur+")",open -1 );
            
        }
        
        dp[ind][open] = ret ? 1 : 0;
        return ret;
    }
    
    public boolean checkValidString(String s) {
        for(int[] ar : dp )
            Arrays.fill(ar,-1);
        return solve(s , 0 , "",0);
    }
}

/*

"(*))"
"(((((()*)(*)*))())())(()())())))((**)))))(()())()"
"(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"

*/