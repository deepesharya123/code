class Solution {
    public String largestOddNumber(String num) {
        String ans = "";
        int ind = -1 ;
        for(int i = num.length() - 1 ; i >= 0 ; i-- ){
            if( (num.charAt(i) -'0' ) % 2  != 0  ){
                ind = i;
                break;
            }
        }
        if( ind == -1)
            return "";
        
        for(int i = 0 ; i <= ind ; i++ )
            ans+=num.charAt(i);
        return ans;
    }
}