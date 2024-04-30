class Solution {
    public long wonderfulSubstrings(String word) {
        HashMap<Long,Long> map = new HashMap<>();
        long ans = 0 , prefix  = 0;
        map.put(0l,1l);
        
        for(int i = 0 ; i < word.length() ; i++ ){
            char c = word.charAt(i);
            prefix = prefix ^ (1 << (c-'a'));
        
            ans+=map.getOrDefault(prefix , 0l);
            
            for(char  ch = 'a' ; ch <= 'j' ;ch++ ){
                long odd = prefix ^ ( 1 << (ch-'a'));
                ans+=map.getOrDefault(odd, 0l );
            }
            map.put(prefix, map.getOrDefault(prefix ,0l ) + 1);
        }
        
        return ans;
        
    }
}