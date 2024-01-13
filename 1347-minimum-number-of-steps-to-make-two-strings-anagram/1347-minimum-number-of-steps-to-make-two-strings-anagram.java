class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for( char c : s.toCharArray() ){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        int ans = 0;
        int[] count = new int[26];
        for(char c : t.toCharArray() ){
            count[c-'a']++;
        }
        for(int i = 0; i < 26; i++ ){
            char c = (char)('a'+i);
            if( count[i] > 0 ){
                if( !hm.containsKey(c) )
                    ans+=count[i];
                else if( hm.get(c) < count[i])
                    ans+=Math.abs(count[i]-hm.get(c));
            }
        }
        
        return ans;
    }
}