class Solution {
    HashSet<String> set = new HashSet<>();
    HashMap<String,Integer> hm = new HashMap<>();
    
    public int solve(String s){
        if(s.length() == 0)
            return 0;
        
        if(hm.containsKey(s))
            return hm.get(s);
        
        int mx = 0;
        for(int i = 0; i < s.length() ; i++){
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);
            int ans = 0;
            
            if( set.contains(sb.toString()) ){
                ans += 1+ solve(sb.toString()); 
            }
            mx = Math.max(mx, ans);
        }
        hm.put(s, mx);
        return mx;
    }
    
    
    public int longestStrChain(String[] words) {
        for(String s : words)
            set.add(s);
        int res = 0;
        for(String s : words)
            res = Math.max(res, 1 + solve(s));
        
        return res;
    }
}