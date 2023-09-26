class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        int[] vis = new int[26];
        int i = 0;
        for(char c : s.toCharArray())
            count[c-'a'] = i++;
        Stack<Character> letters = new Stack<>();
        i = -1;
        for(char c : s.toCharArray()){
            i++;
            if( vis[c-'a'] == 1 )
                continue;
            
            while( !letters.isEmpty() && letters.peek() > c && count[letters.peek()-'a'] > i ){
                vis[letters.peek()-'a'] = 0;
                letters.pop();
            }
            letters.push(c);
            vis[c-'a'] = 1;
        }
        String  ans = "";
        while( !letters.isEmpty() ){
            char c = letters.pop();
            ans = c + ans;
            
        }
        return ans;
    }
}
