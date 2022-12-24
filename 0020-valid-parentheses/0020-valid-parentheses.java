class Solution {
    public boolean isValid(String s) {
        int i = 0;
        List<Character> o = new ArrayList<>();
        List<Character> c = new ArrayList<>();
        o.add('(');
        c.add(')');
        o.add('[');
        c.add(']');
        o.add('{');
        c.add('}');
        
        Stack<Character> st = new Stack<>();
        for(i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(o.get(0)==ch || o.get(1)==ch || o.get(2)==ch){
                st.push(ch);
            }else{
                
                // System.out.println(st.peek());
                if(st.size()==0 || o.indexOf(st.peek()) != c.indexOf(ch))
                    return false;
                st.pop();
            }
        }
        return  st.size()>0?false:true;
    }
}