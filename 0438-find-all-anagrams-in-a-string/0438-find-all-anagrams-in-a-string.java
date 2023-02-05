class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0, j=0;
        for(char c: p.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);
        
        int required = map.size();
        while(j<s.length()){
            char c = s.charAt(j);
            
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
                if(map.get(c)==0)
                    required--;
            }
            
            while(required==0){
                if(j-i+1==p.length())
                ans.add(i);
                
                char b = s.charAt(i);
                if(map.containsKey(b)){
                    map.put(b,map.get(b)+1);
                    if(map.get(b)==1)
                        required++;
                }
                i++;
            }
            j++;
            
        }
        
        
        return ans;
    }
}