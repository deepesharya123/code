class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        int open = 0;
        String ans = "";
        for(int i = 0 ; i < s.length() ; i++ ){
            char c = s.charAt(i);
            if( open <= 0&& c == ')' )
                continue;
            if( c == '(' ){
                open++;
            }
            else if( c == ')') {
                open--;
            }
            stack.add(i);
        }
        
        while( stack.size() > 0 ){
            char c = s.charAt(stack.pop());
            if( c == '(' && open > 0 ){
                open--;
                continue;
            }
            ans = c+ans;
        }        
        
        return ans;
    }
}