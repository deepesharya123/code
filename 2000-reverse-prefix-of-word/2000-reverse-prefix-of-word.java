class Solution {
    
    public String reverse(int last , String word){
        char[] car = word.toCharArray();
        for(int i = 0 ; i < (last+1) / 2 ; i++){
            char temp = car[i];
            car[i] = car[last-i];
            car[last-i] = temp;
        }
        
        String ans = "";
        for( char c : car)
            ans+=c;
        return ans;
    }
    
    public String reversePrefix(String word, char ch) {
        for(int i = 0 ; i < word.length() ; i++ ){
            char c = word.charAt(i);
            if( c == ch ){
                return reverse(i , word);
            }
        }
        return word;
    }
}