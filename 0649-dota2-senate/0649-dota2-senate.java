class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        HashSet<Integer> skip = new HashSet<>();
     
        for(int i = 0; i <senate.length() ; i++ ){
            char c = senate.charAt(i);
            if(c == 'R'){
                r.add(i);
            }else{
                d.add(i);
            }
        }
        int n = senate.length();
        while(( r.size() >=1 && d.size() >=1 )){
            int indexr = r.remove();
            int indexd = d.remove();
            
            if(indexr < indexd){
                r.add(indexr+n-1);
            }else
                d.add(indexd+n-1);
            
            
        }
  
        return r.size() == 0 ? "Dire" : "Radiant";
    }
}