class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans = ' ';
        int n = letters.length;
        int i = 0, j = n-1;
        while( i <= j){
            int mid = (j-i)/2;
            mid+=i;
            char m = letters[mid];
            if( m > target){
                ans = m;
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        
        return ans == ' ' ? letters[0] : ans;
    }
}