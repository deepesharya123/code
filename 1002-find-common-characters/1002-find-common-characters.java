class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ans = new ArrayList<>();
        for( int i = 0 ; i < 26 ; i++){
            char c =(char) ((int)'a' +i);
            int presentInAll = 0;
            int minCount = Integer.MAX_VALUE;
            for(String s: words){
                int count = 0;
                int presence = 0;
                for(char cc : s.toCharArray()){
                    if(cc == c){
                        if(presence == 0)
                            presence++;
                        count++;
                    }
                }
                presentInAll+=presence;
                
                minCount = Math.min(minCount, count);
            }
            
            if(presentInAll == words.length){
                int add = minCount != Integer.MAX_VALUE ? minCount : 0;
                while(add > 0 ){
                    ans.add(""+c);
                    add--;
                }   
            }
        }
        return ans;
    }
}