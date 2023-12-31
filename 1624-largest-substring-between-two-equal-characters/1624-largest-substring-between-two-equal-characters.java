class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] count = new int[26];
        Arrays.fill(count,-1);
        int ans = 0;
        boolean pres = false;
        for(int i = 0 ; i < s.length() ; i++ ){
            char c = s.charAt(i);
            if( count[c-'a'] == -1 )
                count[c-'a'] = i;
            else{
                ans = Math.max(ans, i-1 - (count[c-'a']) );
                pres = true;
            }
        }
        if( !pres )
            return -1;
        return ans;
    }
}