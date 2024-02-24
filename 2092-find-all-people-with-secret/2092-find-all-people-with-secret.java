class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        HashMap<Integer,List<int[]>> map = new HashMap<>();
        
        for(int[] ar : meetings ){
            int x = ar[0] , y = ar[1] , time = ar[2];
            map.computeIfAbsent(x, k -> new ArrayList<>()).add(new int[]{y,time});
            map.computeIfAbsent(y, k -> new ArrayList<>()).add(new int[]{x,time});
        }
        
        int[] secret = new int[n];
        Arrays.fill(secret, Integer.MAX_VALUE );
        secret[firstPerson] = secret[0] = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(0);
        queue.offer(firstPerson);
        
        while( !queue.isEmpty() ){
            int node = queue.poll();
            
            for(int[] nbr : map.getOrDefault(node, new ArrayList<>() )){
                if( nbr[1] >= secret[node] && secret[nbr[0]] > nbr[1] ){
                    secret[nbr[0]] = nbr[1]; 
                    queue.add(nbr[0]);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n ;i++ )
            if( secret[i] != Integer.MAX_VALUE )
                ans.add(i);
        
        return ans;
    }
}