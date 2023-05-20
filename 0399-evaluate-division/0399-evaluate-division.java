class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, List<Pair<String,Double>>> graph = new HashMap();
        int i = 0, q = queries.size();
        double[] ans = new double[q];
        for( i = 0; i < values.length; i++){
            String src = equations.get(i).get(0);
            String des = equations.get(i).get(1);
            
            graph.putIfAbsent(src,new ArrayList());
            graph.putIfAbsent(des,new ArrayList());
            
            graph.get(src).add(new Pair(des, values[i]));
            graph.get(des).add(new Pair(src, 1/values[i]));
            
        }
        
        for(i = 0 ; i< q; i++)
            ans[i] = dfs(queries.get(i).get(0), queries.get(i).get(1), graph, new HashSet());
        
        return ans;
    }
    
    public double dfs(String s, String d,  HashMap<String, List<Pair<String,Double>>>  graph, Set<String> visited){
        if(!graph.containsKey(s) || !graph.containsKey(d))
            return -1.0;
        
        if(s.equals(d))
            return 1.0;

        visited.add(s);
        // System.out.println(graph.get(s) +" "+s+" "+d);
        for(Pair<String,Double> pair : graph.get(s)){
            String nbr = pair.getKey();
            double weight = pair.getValue();
            if(visited.contains(nbr))
                continue;    
            double ans = dfs(nbr, d, graph, visited);
            if(ans != -1.0)
               return ans *= weight;
        }            
        return -1.0;
    }
    
}