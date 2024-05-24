class Solution {
    
    // int[] dp = new int[]
    public int solve(String[] words , int[] score,int[] freq , int ind ){
        int n = words.length ; 
        if( ind >= n )
            return 0;
        
        int ret = 0 ;
//         include current word
        boolean remove  = true;
        int add = 0;
        List<Character> letters = new ArrayList<>();
        for(char c : words[ind].toCharArray() ){
            if( freq[c-'a'] == 0 ){
                // possible = false;
                letters = new ArrayList<>();
                break;
            }
            letters.add(c);
        }
        
        for( int i = 0 ; i <letters.size() ; i++  ){
            char c = letters.get(i);
            
            if( freq[c-'a'] == 0 ){
                add = 0;
                for(int j = 0 ; j < i ; j++ ){
                    char cc = letters.get(j);
                    freq[cc-'a']++;
                }
                remove = false;
                break;
            }
            add += score[c-'a'];
            freq[c-'a']--;
        }
        
        int inc = add + solve(words , score, freq, ind + 1);
        if( remove )
        for( char c : letters )
            freq[c-'a']++;
//         do not make current word
        int dis = solve(words, score, freq, ind + 1);
        
        ret = Math.max(inc, dis);
        return ret;
    }
    
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq = new int[26];
        for(char c : letters ){
            freq[c-'a']++;
        }
        
        return solve(words, score , freq , 0 );
        
    }
}

/*

["dog","cat","dad","good"]
["a","a","c","d","d","d","g","o","o"]
[1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0]


*/