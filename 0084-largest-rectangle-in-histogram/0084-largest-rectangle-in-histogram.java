class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length ,i = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        for(i=0;i<n;i++){
            int num = heights[i];
            while(st.size()>0 && heights[st.peek()]>= num )
                st.pop();
            
            if(st.size()==0){
                left[i]=0;
                st.push(i);
            }else{
                left[i]= st.peek()+1;
                st.push(i);
            }
        }
        st.clear();
        for(i=n-1;i>=0;i--){
            int num = heights[i];
            while(st.size()>0 && heights[st.peek()]>=num )
                st.pop();
            
            if(st.size()==0){
                right[i]=n-1;
                st.push(i);
            }else{
                right[i]= st.peek()-1;
                st.push(i);
            }
        
        }
        long ans = 0;
        for(i=0;i<n;i++){
            long add = (i - left[i]+1)*heights[i];
            add+=(right[i]-i)*heights[i];
            ans = Math.max(ans,add);
        }
        return (int)ans;
    }
}