class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        HashMap<Integer,ArrayList<Pair<Integer,Integer>>> map = new HashMap<>();
        for(int[] ar : flights ){
            int from = ar[0] , to = ar[1] , price = ar[2];
            if(!map.containsKey(from))
                map.put(from, new ArrayList<>());
            map.get(from).add(new Pair(to,price));
        }
        //         cur_k , cur_node, cur_cost
        PriorityQueue<Pair<Integer,Pair<Integer,Integer>>> queue = new PriorityQueue<>((a,b)-> a.getKey()-b.getKey());
        queue.add(new Pair(0,new Pair(src,0)));
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0 ;
        while( queue.size() > 0 ){
            int cur_k = queue.peek().getKey();
            int cur_node = queue.peek().getValue().getKey();
            int cur_cost = queue.peek().getValue().getValue();
            
            queue.poll();
            if( map.get(cur_node) != null )
            for(Pair<Integer,Integer> nbr : map.get(cur_node)){
                int nbr_node = nbr.getKey(), nbr_cost = nbr.getValue();
                
                if( dist[nbr_node] > cur_cost + nbr_cost ){
                    if( cur_k + 1 <= k || cur_k+1 == k+1 && nbr_node == dst ){
                        dist[nbr_node] = cur_cost + nbr_cost;
                        queue.add(new Pair(cur_k+1, new Pair(nbr_node,dist[nbr_node])));
                    }
                        
                }
            
            
            }

        }
        int ans = dist[dst];
        return ans == Integer.MAX_VALUE ? -1 : ans;
        
    }
}