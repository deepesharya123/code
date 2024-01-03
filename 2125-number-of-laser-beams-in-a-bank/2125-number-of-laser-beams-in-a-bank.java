class Solution {
    
    public int count(String s){
        int  temp = 0;
        for(char c : s.toCharArray() )
            temp += c == '1' ? 1 : 0;
        return temp;
    }
    
    public int numberOfBeams(String[] bank) {
        int ans = 0, n = bank.length , m = bank[0].length() ;
        for(int i = 0 ; i < n - 1 ; i++ ){
            int cur = 0 , next = 0;
            cur = count(bank[i]);
            if( cur == 0 )
                continue;
            int j = i + 1;
            while( j < n && next == 0){
                next = count(bank[j++]);
            }
            ans+=(cur*next);
        }
        return ans;
    }
}