class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        for(int i = 0 ; i < s.length() -1 ; i++ ){
            char a = s.charAt(i) , b = s.charAt(i+1);
            int dif = (int)Math.abs((int)(a) - (int)(b));
            ans+=dif;
        }
        
        return ans;
    }
}