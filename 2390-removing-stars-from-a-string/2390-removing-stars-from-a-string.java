class Solution {
    public String removeStars(String s) {
        int len = s.length();
        Stack<Character> st = new Stack<>();
        for( char c : s.toCharArray()){
            if(c=='*'){
                st.pop();
            }else{
                st.push(c);
            }
        }
        String ans = "";
        while(st.size()>0){
            char c = st.peek();
            st.pop();
            ans = c+ans;
        }
        return ans;
    }
}