class Solution {
    public boolean winnerOfGame(String colors) {
        int a = 0 , b = 0;
        int alice_ans = 0, bob_ans = 0;
        for( int i = 0 ; i < colors.length() ; i++){
            // System.out.println( i+" checking for i");
            int temp = 0;
            char c = colors.charAt(i);
            if( c == 'A') a++;
            else b++;
            for( int j = i + 1 ; j < colors.length() ; j++){
                if( c == 'A' && colors.charAt(j) == c){
                    a++;
                    
                    if( j == colors.length() - 1 && a >= 3){
                        alice_ans+=a-2;
                        i = colors.length();
                        // break;
                    }
                }else if( c == 'B' && colors.charAt(j) == c){
                    b++;
                    if( j == colors.length() - 1 && b >= 3){
                        bob_ans+=b-2;
                        i = colors.length();
                        // break;
                    } 

                }else{
                    // System.out.println( j +"  for j "+a+" $ "+b);
                    
                    if( a >= 3 ) alice_ans+=a-2;
                    if( b >= 3 ) bob_ans+=b-2;
                    i = j - 1;
                    a = 0;
                    b = 0;
                    j = colors.length()+12;
                }
            }
        }
        
        // System.out.println( alice_ans+" # "+ bob_ans+" l "+colors.length());
        return alice_ans > bob_ans;
    }
}

/*

"AAABABB"
"AA"
"ABBBBBBBAAA"
"AAAABBBB"

*/