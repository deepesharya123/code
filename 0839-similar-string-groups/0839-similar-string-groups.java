class Solution {
    HashMap<String, Integer> map = new HashMap<>();
    
    public void dfs(int node, List<List<Integer>> list, int[] vis){
        vis[node] = 1;
        
        for(int neighbour : list.get(node)){
            if(vis[neighbour] == 0){
                dfs(neighbour, list, vis);
            }
        }
        return ;
    }
    
    public int numSimilarGroups(String[] strs) {
        int i = 0 , j = 0;
        List<List<Integer>> list = new ArrayList<>();
        List<String> str = new ArrayList<>();
        
        for(String s: strs){
            if(!map.containsKey(s)){
                map.put(s, i++);
                str.add(s);
            }
            list.add(new ArrayList<>());
        }    
        i = 0;
  
        int n = str.size();
        for(i = 0 ;i < n ; i++){
            for(j = i+1; j <n;j++){
                if(i == j)
                    continue;
                
                int dif = 0;
                for(int k = 0 ; k< str.get(i).length() ; k++)
                    if(str.get(i).charAt(k) != str.get(j).charAt(k))
                        dif++;
                int a = map.get(str.get(i)) , b = map.get(str.get(j));
                System.out.println(a+" "+ b +" "+dif);
                if(  dif < 3){
                    list.get(a).add(b);
                    list.get(b).add(a);
                }
                
                
            }
        }
        int[] vis = new int[n];
        int count = 0;
        for(i = 0; i <n;i++){
            if(vis[i] == 0){
                count++;
                dfs(i, list, vis);
            }
        }
        
        return count;
        
    }
}

/*

["tars","rats","arts","star"]
["omv","ovm"]

*/