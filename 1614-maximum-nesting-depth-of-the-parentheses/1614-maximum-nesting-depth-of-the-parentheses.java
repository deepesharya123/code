class Solution {
    public int maxDepth(String s) {
        int ans = 0 , open = 0;
        for( char c : s.toCharArray() ){
            if( c == '(' ){
                open++;
                ans = Math.max(ans, open);
            }else if( c == ')' )
                open--;
        }
        return ans;
    }
}