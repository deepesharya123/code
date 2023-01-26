import java.util.*;
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
//         steps, cost , node
        PriorityQueue<Pair<Integer,Pair<Integer,Integer>>> pq;
        pq = new PriorityQueue<>((a,b)-> a.getKey()-b.getKey());
        int ans=  Integer.MAX_VALUE;
        pq.add(new Pair(0,new Pair(0,src)));
        
//         from -> [Pair(to, cost)]
        List<List<Pair<Integer,Integer>>> adj = new ArrayList<>();
        for(int i = 0;i<n;i++){
            List<Pair<Integer,Integer>> temp = new ArrayList<>();
            adj.add(temp);
        }
        for(int i = 0;i<flights.length;i++){
            int from = flights[i][0];
            int to = flights[i][1];
            int cost = flights[i][2];
            
            adj.get(from).add(new Pair(to, cost));
            
        }
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        while(!pq.isEmpty()){
            int steps = (int) pq.peek().getKey();
            int cost = (int) pq.peek().getValue().getKey();
            int node = (int) pq.peek().getValue().getValue();
            pq.remove();
            
            for(Pair<Integer,Integer> p: adj.get(node)){
                int nbr = (int) p.getKey();
                int cos = (int) p.getValue();
                
                if(cost+cos<=dist[nbr] ){
                    if(steps+1<=k ){
                        dist[nbr] = cost+cos;
                        // System.out.println(nbr+" i "+dist[nbr]);
                        pq.add(new Pair(steps+1,new Pair(cost+cos,nbr)));
                    }else if(steps+1==k+1 && nbr==dst){
                        dist[nbr] = cost+cos;
                        // System.out.println(nbr+" e "+dist[nbr]);
                        pq.add(new Pair(steps+1,new Pair(cost+cos,nbr)));    
                    }
                }
            }
            
            
        }
        // for(int d:dist)
        //     System.out.print(d+" ");
        // System.out.println();
        
        
        return dist[dst]==Integer.MAX_VALUE ? -1: dist[dst];
        
    }
}
