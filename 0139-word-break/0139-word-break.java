class Solution {
    Map<String, Boolean> hm = new HashMap<>();
    public boolean solve(String s, int i, HashSet<String> set, String cur){
        int n = s.length();
        if(i >= n)
            return set.contains(cur);
        String key = cur+ "_"+i;
        
        if( hm.containsKey(key))
            return hm.get(key);
        
        char c = s.charAt(i);
        boolean inc = false, dis = false;
        String check =cur+c;
        if(set.contains(check))
            inc = true & solve(s , i + 1, set, "");
        dis = solve(s , i+1, set, cur+c);
        
        // System.out.println(i+"_"+inc+"_"+dis+"_"+cur+"_"+c+"_"+check);
        hm.put(key, (inc | dis));
        return (inc | dis);
    }
    
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        for(String ts : wordDict)
            set.add(ts);
        return solve(s,0, set,"");
    }
}


/*

"a"
["a","b"]
"b"
["a","b"]
"c"
["a","b"]


*/