class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int i = 0, j = 0;
        while(i < pushed.length && j < pushed.length){
            int peek_element = st.size() > 0 ? st.peek() : -1;
            if( peek_element == popped[j] ){
                while(st.size() > 0 && st.peek() == popped[j]){
                    j++;
                    st.pop();
                }
                System.out.println(st+" a");
            }else{
                st.push(pushed[i++]);
            }
        }
        while(j < popped.length && st.size() > 0 && st.peek() == popped[j]){
            j++;
            st.pop();
        }
        return ! (st.size() > 0);
    }
}

/*

[1,2,3,4,5]
[4,3,5,1,2]
[1,2,3,4,5]
[4,5,3,2,1]
[1,2,3,4,5]
[4,5,2,3,1]


*/
