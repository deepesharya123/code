class Solution {
    int ans = 0;
    int[] dp = new int[100005];
    int mod = (int) (1e9)+7;
    public int solve(int ind, String s, int k){
        if(dp[ind] != -1)
            return dp[ind];
        
        String p = "";
    
        int ret = 0;
        for(int i = ind  ;i < ind + 10 && i< s.length(); i++){
            p+=s.charAt(i);
             long num= Long.parseLong(p);
            // System.out.println("num num "+num);
            
            if(num > k || p.charAt(0) =='0')
                continue;
            ret%=mod;
            if(i == s.length()-1)
                ret+=1;
            ret += solve(i+1 , s,k);
        }
        ret%=mod;
        return dp[ind] = ret;
    }
    
    
    public int numberOfArrays(String s, int k) {
        String p = "";
        Arrays.fill(dp,-1);
        for(int i = 0;i < 10 && i<s.length() ; i++){
            p+=s.charAt(i);
            long num = Long.parseLong(p);
            // System.out.println("num "+num);
            if(num > k || p.charAt(0) =='0')
                continue;
            ans%=mod;
            if(i == s.length()-1)
                ans+=1;
            ans+=solve(i+1 , s,k);
        }
        ans%=mod;
        
        return ans;
    }
}

/*

"1000"
10000
"1000"
10
"1317"
20000


*/