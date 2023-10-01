class Solution {
    
    public String reverse(String word){
        String rev = "";
        for( char c :  word.toCharArray())
            rev = c+rev;
        return rev;
    }
    
    public String reverseWords(String s) {
        String ans = "";
        String word = "";
        for( char c : s.toCharArray()){
            if( c == ' '){
                ans+=reverse(word);
                ans+=" ";
                word = "";
            }else
                word+=c;
        }
        
        ans+=reverse(word);
        return ans;
    }
}