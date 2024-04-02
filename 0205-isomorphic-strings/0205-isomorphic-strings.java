class Solution {
    public boolean isIsomorphic(String s, String t) {
        if( s.length() != t.length() )
            return false;
        
        HashMap<Character, Character> map = new HashMap<>();   
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i < s.length() ; i++ ){
            char c = s.charAt(i) , ch = t.charAt(i);
            if( !map.containsKey(c) ){
                if( set.contains(ch) )
                    return false;
                map.put(c,ch);
                set.add(ch);
            }
            else{
                if( map.get(c) != ch )
                    return false;
            }
            
        }
        
        return true;
    }
}