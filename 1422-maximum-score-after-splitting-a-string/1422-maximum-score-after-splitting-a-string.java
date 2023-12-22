class Solution {
    public int maxScore(String s) {
        int ans = Integer.MIN_VALUE;
        int n = s.length();
        int totalOnes = 0, curOne = 0, zero = 0;
        for(int i = 0 ; i < n ; i++ ){
            char c = s.charAt(i);
            totalOnes+= c =='1' ? 1 : 0;
        }
        
        for(int i = 0 ; i < n-1 ; i++ ){
            char c = s.charAt(i);
            zero+= c == '0' ? 1 : 0;
            curOne+= c =='1' ? 1 : 0;
            int temp = zero + (totalOnes-curOne);
            ans = Math.max(temp, ans);
        }
        
       return ans;
    
    }
}


/*


"011101"
"00111"
"1111"
"111111"
"000"
"0000"
"0100"



*/