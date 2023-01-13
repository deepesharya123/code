class Solution {
    int ans = 0;
    public  int path(List<List<Integer>> adj, int node, String s, int par){
        List<Integer> list = adj.get(node);
        
        if(list==null || list.size()==0)
            return 1;
        
        int[] ar = new int[2];
        ar[0]=ar[1]=0;
        for(int it : list ){
            if(it==par)
                continue;
            int child =0; 
            int paren = node;
            child = path(adj,it,s,paren);
            if(s.charAt(node)!=s.charAt(it)){    
                child++;
            }else
                child=0;
            
            if(child>=ar[1]){
                ar[0]=ar[1];
                ar[1]=child;
            }else if(child>ar[0]){
                ar[0]=child;
            }
        }
  
        
        ans =Math.max(ans,ar[0]+ar[1]);
        return ar[1];
        // return (int)Math.max(ar[0],ar[1]);
        
    }
    public int longestPath(int[] parent, String s) {
        List<List<Integer>> adj = new ArrayList<>();
        int  i= 0, n = parent.length;
        for(i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(i=1;i<n;i++){
            adj.get(parent[i]).add(i);
            adj.get(i).add(parent[i]);
        }
        // System.out.println(adj);
        path(adj,0,s,-1);
    
        return ans+1;
    }
}

/*

[-1,0,0,1,1,2]
"abacbe"
[-1,0,0,0]
"aabc"
[-1,0,0,0,1,1,5,5,2,2,9,9,3,3,13,13]
"baababababbabbbb"


*/