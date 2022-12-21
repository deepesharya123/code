class Solution {
    public boolean possibleBipartition(int ns, int[][] dislikes) {
        if(ns>1 && ns== dislikes.length) return false;
        
        boolean ans = true;
        List<List<Integer>> adj = new ArrayList<>();
        int i =0,j=0, n =dislikes.length , m = n>0 ?dislikes[0].length:0;
        for(i=0;i<=ns;i++){
            adj.add(new ArrayList<>());
        }
        
        for(i=0;i<n;i++){
            adj.get(dislikes[i][0]).add(dislikes[i][1]);
        }
        int[] vis = new int[ns+1];
        
        for(i=1;i<=ns;i++){
            List<Integer> l = adj.get(i);
            for(int it: l){
                List<Integer> sl = adj.get(it);
                for(int search :  sl){
                    if(l.indexOf(search)>=0){
                        ans = false;
                        break;
                    }
                }
                if(!ans) break;
            }
                if(!ans) break;
        }
        return ans;
        
    }
}