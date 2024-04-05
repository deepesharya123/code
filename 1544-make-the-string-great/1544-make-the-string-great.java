class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
    
        int dif = (int) ('a'-'A');
        for(int i = 0 ; i  < s.length()  ; i++ ){
            char c = s.charAt(i) ;
            if( st.size() > 0 ){
                char p = st.peek();
                if( p == (char)(c + dif) || (char)( p + dif ) == c ) {
                    st.pop();
                    continue;
                }
            }
            st.push(c);
        }
        
        // System.out.println()
        while( st.size() > 0 ){
            char c = st.pop();
            ans = c + ans;
        }
        return ans;
    }
}