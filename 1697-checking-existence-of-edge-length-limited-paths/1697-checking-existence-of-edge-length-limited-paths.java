class Solution {
    
    int[] parent;
    int[] rank;
    
    Solution(){
        int n = 100004;
        parent = new int[n];
        rank = new int[n];
        for(int i = 0;i<n;i++)
            parent[i] = i;
    }
    
    public void union(int u, int v){
        int pu = findParent(u), pv = findParent(v);
        int ru = rank[pu] , rv = rank[pv];
        
        if(pu == pv)
            return;
        if(ru < rv){
            parent[pu] = pv;
        }else if(rv < ru)
            parent[pv] = pu;
        else{
            parent[pu] = pv;
            rank[pv]++;
        }
        return;
    }
    
    public int findParent(int u){
        if( u != parent[u])
            parent[u] = findParent(parent[u]);
        return parent[u] ;
    }
    
    public boolean connected(int u, int v){
        return findParent(u) == findParent(v);
    }
    
    public void sort(int[][] query){
         Arrays.sort(query, new Comparator<int[] >(){
            @Override
            public int compare(int[] first, int[] second){
                return first[2] - second[2]; 
            }
        });
    }
    
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        int no_of_query = queries.length;
        int[][] query = new int[no_of_query][4];
        int i = 0, j = 0;
        for( i =0 ;i < no_of_query ; i++){
            query[i][0] = queries[i][0];
            query[i][1] = queries[i][1];
            query[i][2] = queries[i][2];
            query[i][3] = i;
        }

        sort(query);
        sort(edgeList);
       
        int currentEdge = 0;
        int edges = edgeList.length;
        boolean[] ans = new boolean[no_of_query];
        for(i = 0;i < no_of_query ; i++){
            int u = query[i][0], v = query[i][1], limit = query[i][2], ind = query[i][3];
            while( currentEdge < edges && edgeList[currentEdge][2] < limit){
                int p = edgeList[currentEdge][0], q = edgeList[currentEdge][1] ;
                union(p,q);
                currentEdge++;
            }
            ans[ind] = findParent(u) == findParent(v);
        }
        return ans;
    }
}