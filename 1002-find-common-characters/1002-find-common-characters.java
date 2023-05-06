class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c = 'a';c<='z';c++)
            map.put(c,Integer.MAX_VALUE);
        for( String s: words){
            HashMap<Character, Integer> temp = new HashMap<>();
            for(char c = 'a';c<='z';c++)
                temp.put(c,0);
            for( char c : s.toCharArray()){
                temp.put(c, temp.get(c)+1);
            }
        
            for(char c = 'a' ; c<= 'z' ;c++){
                if(temp.containsKey(c))
                    map.put(c, Math.min(map.get(c),temp.get(c)));
            }
        }
        List<String> ans = new ArrayList<>();
        for(char c = 'a' ; c<= 'z' ;c++){
            int add = map.get(c);
            while(add > 0 && add != Integer.MAX_VALUE){
                ans.add(""+c);
                add--;
            }
        }
        return ans;
    }
}

/*

["bella","label","roller"]

*/