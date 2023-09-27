class Solution {
    
    public boolean isChar(char c){
        return (c >= 'a' && c <= 'z');    
    }
    
    public String decodeAtIndex(String s, int k) {
        long siz = 0;
        for( char c : s.toCharArray() ){
            if( isChar(c) ){
                siz++;
            }else{
                siz *= (c-'0');
            }
        }
        System.out.println(siz);
        int n = s.length();
        String ans = "";
        for(int i = n - 1 ; i>= 0 ; i--){
            char c = s.charAt(i);
            k%=siz;
            if( k == 0 && isChar(c)){
                ans+=c;
                return ans;
            }
            
            if( !isChar(c) ){
                siz /= (c-'0');
            }else{
                siz--;
            }
        }
        return ans;
    }
}