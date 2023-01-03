class Solution {
    public int minDeletionSize(String[] strs) {
        int ans = 0;
        for( int i =0;i<strs[0].length();i++){
           char c = strs[0].charAt(i);
            for(int j =1;j<strs.length;j++){
                if(strs[j].charAt(i)<c){
                    ans++;
                    break;
                }else
                    c = strs[j].charAt(i);
            }    
        }
        return ans;
    }
}