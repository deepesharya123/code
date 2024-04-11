class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();
        for(char c : num.toCharArray() ){
            int n = Integer.parseInt(""+c);
            if( stack.size() == 0 )
                stack.add(n);
            else{
                while( k > 0 && stack.size() > 0 &&  stack.peek() > n ){
                    stack.pop();
                    k--;
                }
                stack.add(n);
            }
            // System.out.println(stack);
        }
        
        while( k-- > 0 )
            stack.pop();
        StringBuilder ans = new StringBuilder();
        
        while( stack.size() > 0 )
            ans.append(stack.pop());
        
        ans.reverse();
        
        while( ans.length() > 0 && ans.charAt(0) == '0')
            ans.deleteCharAt(0);
        
        return ans.length() > 0 ? ans.toString() : "0";
        
    }
}