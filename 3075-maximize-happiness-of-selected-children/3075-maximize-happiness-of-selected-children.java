class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer> ( Collections.reverseOrder() );
        for( int x: happiness)
        {
            pq.add( x );
        }
        int cnt = 0 ;
        long ans = 0 ;
        for( int i =0 ; i < k ; i++)
        {
            int temp =  pq.poll();
            temp =  temp - cnt ;
            if( temp > 0)
            ans += temp ;
            cnt++;
        }
        return ans;
    }
}