class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<Integer>();
        int i=0, n = temperatures.length;
        int[] ans = new int[n];
        for(i=n-1;i>=0;i--){
            int num = temperatures[i];
            if(i==n-1){
                ans[i]=0;
            }else{
                while(st.size()>0 && temperatures[st.peek()]<=num){
                    st.pop();
                }   
                if(st.size()>0){
                    ans[i]=st.peek()-i;
                }
            }
            st.push(i);
        }
        return ans;
    }
}