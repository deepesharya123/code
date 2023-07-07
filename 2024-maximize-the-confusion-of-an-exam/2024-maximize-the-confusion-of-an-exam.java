class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans = 0, tru = 0, fals = 0;
        int i = 0,  j = 0, n = answerKey.length();
        while( j < n ){
            char c = answerKey.charAt(j);
            if( c == 'T' ) tru++;
            else fals++;
            
            if( tru <= k ){
                ans = Math.max(ans, j-i + 1);
                j++;
            }else if( fals <= k){
                ans = Math.max(ans, j-i + 1);
                j++;    
            }else {
                while( tru > k && fals > k && i <= j){
                    char ch = answerKey.charAt(i++);
                    if( ch == 'T') tru--;
                    else fals--;
                }
                ans = Math.max(ans, j-i+1);
                j++;
            }
            
        }
        return ans;
    }
}