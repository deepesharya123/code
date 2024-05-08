class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> maxheap =  new PriorityQueue<>(Collections.reverseOrder());
        String[] ans = new String[score.length];
        
        for(int i = 0 ; i <  score.length; i++ ){
            int scor = score[i];
            map.put( scor , i );
            maxheap.add( scor);
        }
        int rank = 0;
        Arrays.fill(ans, "");
        while( maxheap.size() > 0 ){
            int scor = maxheap.poll();
            int ind = map.get(scor);
            if( rank == 0 ){
                ans[ind] += "Gold Medal";
            }else if( rank == 1 ){
                ans[ind] += "Silver Medal";
            }
            else if( rank == 2 ){
                ans[ind] += "Bronze Medal";
            }else{
                int add = rank + 1 ;
                ans[ind]+=""+add;
            }
            rank++;
        }
        
        return ans;
        
    }
}