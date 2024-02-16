class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr )
            map.put(num,map.getOrDefault(num,0)+1);
        
//         freq,num
        PriorityQueue<Pair<Integer,Integer>> min_heap = new PriorityQueue<>((a,b) -> a.getKey()-b.getKey() );
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey(), freq = entry.getValue();
            min_heap.add(new Pair(freq,num));
        }
        int ans = 0;
        // System.out.println(min_heap);
        
        while( k-- > 0 ){
            Pair p = min_heap.poll();
            int num = (int) p.getValue(), freq = (int)  p.getKey();
            freq--;
            if( freq > 0 )
                min_heap.add(new Pair(freq,num));
        }
        ans = min_heap.size();
        return ans;
    }
}