class Solution {
    
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        int m = edges.length;
        int[][] graph = new int[m][4];
        for(int i = 0 ; i < m ; i++ ){
            graph[i][3] = i;
            for(int j = 0 ; j < 3; j++ ){
                graph[i][j] = edges[i][j];
            }
        }
        
        Arrays.sort(graph, (a,b) -> a[2] - b[2]);
        UnionFind uf = new UnionFind(n);
        int weight = 0;
        for(int[] edge : graph){
            if(uf.union(edge[0] , edge[1]))
                weight+=edge[2];
        }
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        for(int i = 0 ; i < m ; i++){
//             for ignoreing the current edge
            UnionFind ufig = new UnionFind(n);
            int ignore = 0;
            for(int j = 0 ; j < m ; j++ ){
                if(i != j && ufig.union(graph[j][0], graph[j][1])){
                    ignore+=graph[j][2];
                }
            }
            
            if( ufig.maxSize < n || ignore > weight )
                list.get(0).add(graph[i][3]);
            else{
//                 including the edge for sure. 
                UnionFind uff = new UnionFind(n);
                uff.union(graph[i][0], graph[i][1]);
                int forceWeight = graph[i][2];
                for(int j = 0 ; j < m ; j++){
                    if(i!= j && uff.union(graph[j][0], graph[j][1]))
                        forceWeight+=graph[j][2];
                }
                if(forceWeight == weight)
                    list.get(1).add(graph[i][3]);
            }
        }
        return list;
    }
    
    class UnionFind {
        int[] parent;
        int[] size;
        int maxSize;

        public UnionFind(int n) {
            parent = new int[n];
            size = new int[n];
            maxSize = 1;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int x) {
            // Finds the root of x
            if (x != parent[x]) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public boolean union(int x, int y) {
            // Connects x and y
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                if (size[rootX] < size[rootY]) {
                    int temp = rootX;
                    rootX = rootY;
                    rootY = temp;
                }
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
                maxSize = Math.max(maxSize, size[rootX]);
                return true;
            }
            return false;
        }
    }
}