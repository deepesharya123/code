class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans = 0, tru = 0, fals = 0;
        int i = 0,  j = 0, n = answerKey.length();
        while( j < n ){
            char c = answerKey.charAt(j);
            if( c == 'T' ) tru++;
            else fals++;
//              true is occuring less than k times, so false is more than k times, we can change only trues
            if( tru <= k ){
                ans = Math.max(ans, j-i + 1);
                j++;
            }
//              false is occuring less than k times, so true is more than k times, we can change only false
            else if( fals <= k){
                ans = Math.max(ans, j-i + 1);
                j++;    
            }
//             if both true and false are occuring more than k times , then compress the size of window untill we have either true or false less k times so that we can change that
            else {
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