class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        int i = 0;
        for(i=0;i<n;i++){
            if(i==0){
                left[i]=-1;
                st.push(i);
                continue;
            }
            while(st.size()>0 && 
            ( st.peek()==-1 || height[st.peek()]<=height[i])){
                st.pop();
            }
            if(st.size()>0){
                left[i] = st.peek();
            }else{
                left[i]=-1;
                st.push(i);
            }
        }
        st.clear();
        for(i=n-1;i>=0;i--){
            int store = -1;
            if(i==n-1){
                store = -1;
                left[i]=Math.min(left[i]!=-1?height[left[i]]:-1,store);
                st.push(i);
                continue;
            }
            while(st.size()>0 && 
            (st.peek()==-1 || height[st.peek()]<=height[i])){
                st.pop();
            }
            if(st.size()>0){
                store=st.peek();
                left[i]=Math.min(left[i]!=-1?height[left[i]]:-1,height[store]);
            }else{
                store=-1;
                left[i]=Math.min(left[i]!=-1?height[left[i]]:-1,store);
                st.push(i);
            }
        }
        int ans = 0;
        for(i=0;i<n;i++){
            int num = left[i];
            // System.out.println(num);
            if(num!=-1){
                int add =num-height[i];
                ans+=add;
                // System.out.println(height[num]+" "+height[i]);
            }
        }
        return ans;

    }
}