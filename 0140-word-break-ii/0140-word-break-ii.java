class Solution {
    
    public  void solve(String s , HashSet<String> allowed , List<String> ans , String stringSoFar , int ind ){
        int n = s.length();
        // System.out.println(stringSoFar);
        if( ind >= n ){
            ans.add(stringSoFar);
            return;
        }
        
        String temp = "";
                
        for(int i = ind ; i < n ; i++ ){
            temp += s.charAt(i);
            if( allowed.contains(temp) ){
                
                String pass = "";
                if( stringSoFar.length() != 0)
                    pass += stringSoFar + " "+temp;
                else
                    pass += stringSoFar + "" + temp;
                
                System.out.println(pass+" "+stringSoFar);
//                 included that stirng in stringSoFar
                solve(s , allowed , ans , pass, i + 1);
            }
        }
        return;
    }
    
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> allowed = new HashSet<>();
        for(String word : wordDict)
            allowed.add(word);
        
        List<String> ans = new ArrayList<>();
        solve(s , allowed , ans , "", 0 );
        return ans;
    }
}

/*



"catsanddog"
["cat","cats","and","sand","dog"]
"pineapplepenapple"
["apple","pen","applepen","pine","pineapple"]
"catsandog"
["cats","dog","sand","and","cat"]

*/