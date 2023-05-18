class Solution {
    public int maxArea(int[] height) {
        int n = height.length, ans = Integer.MIN_VALUE;
        int i = 0, j = n-1;
        while(i<j){
            int left = height[i], right = height[j];
            ans = Math.max(ans, Math.min(left, right)*(j-i) );
            if(left < right)    
                i++;
            else
                j--;
        }
        return ans;
    }
}