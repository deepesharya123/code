class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
        for( char c : s.toCharArray() ){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Pair<Integer,Character>> max_heap = new PriorityQueue<>((a,b)-> -a.getKey() + b.getKey());
        
        for(Map.Entry<Character,Integer> entry : map.entrySet() ){
            char c = entry.getKey();
            int val = entry.getValue();
            max_heap.add(new Pair(val,c));    
        }
        String ans = "";
        while(!max_heap.isEmpty() ){
            char c = max_heap.peek().getValue();
            int count  = max_heap.peek().getKey();
            
            while( count-- > 0 ){
                ans+=c;
            }
            max_heap.poll();
        }
        return ans;
    }
}