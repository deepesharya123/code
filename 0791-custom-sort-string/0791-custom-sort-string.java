class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Character> adj = new HashMap<>();
        for(int i = 0 ; i < order.length() - 1 ; i++ ){
            char c = order.charAt(i), next = order.charAt(i+1);
            adj.put(c, next);
        }
        String ans = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++ ){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        char cur = order.charAt(0);
        
        while( map.size() > 0 ){
            if( map.containsKey(cur) ){
                char c = cur;
                int count = map.get(cur);
                if( adj.containsKey(cur) ){
                    char nex = adj.get(cur);
                    adj.remove(cur);
                    cur = nex;
                }
                while( count-- > 0 )
                    ans+=c;
                map.remove(c);
            }else{
                for(Map.Entry<Character,Integer> entry : map.entrySet()){
                    char c = entry.getKey();
                    int val = entry.getValue();
                    while( val-- > 0 )
                        ans+=c;    
                }
                break;
            }
        }
        return ans;
    }
}