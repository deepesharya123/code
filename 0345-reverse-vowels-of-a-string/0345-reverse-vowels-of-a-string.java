class Solution {
    
    public boolean isVowel(char c){
        if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'  || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' )
            return true;
        return false;
    }
    
    public String reverseVowels(String s) {
        int n = s.length();
        char[] c =new char[n];
        int i  = 0,  j =n-1;
        for( i =  0 ; i < n ; i++ ){
            c[i] = s.charAt(i);
        }
        i = 0;
        j = n-1;
        while( i <= j ){
            char front = c[i] , back = c[j];
            boolean frontVowel = isVowel(front), backVowel = isVowel(back);
            if( frontVowel && backVowel ){
                c[i] = back;
                c[j] = front;
                i++;j--;
            }else if( frontVowel && !backVowel){
                j--;
            }else if( !frontVowel && backVowel ){
                i++;
            }else{
                i++;
                j--;
            }
            
        }
        String ans = "";
        for(char cc : c)
            ans+=cc;
        return ans;
    }
}