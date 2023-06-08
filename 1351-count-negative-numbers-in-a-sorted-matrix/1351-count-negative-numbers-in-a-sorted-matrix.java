class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for(int[] ar :  grid)
            for(int num : ar)
                if(num < 0)
                    ans++;
        
        
        return ans;
                
        
    }
}