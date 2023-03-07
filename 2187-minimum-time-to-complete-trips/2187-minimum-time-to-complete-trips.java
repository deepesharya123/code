class Solution {
    
    public long possibleTrips(long mid,int[] time){
        long trips = 0;
        for(int t : time){
            trips+=(mid/t);
        }
        return trips;
    }
    
    long ans = Long.MAX_VALUE;
    
    public void solve(long i, long j, int[] time, int totalTrips){
        while(i<=j){
            long mid = i+ ( (j-i)/2 );
            long tripsPossible = possibleTrips(mid,time);
            if(tripsPossible >= totalTrips){
                ans = Math.min(mid,ans);
                j = mid - 1;
            }else
                i = mid + 1;
        }
    }
    
    public long minimumTime(int[] time, int totalTrips) {
        long i = 0, j = totalTrips;
        int n = time.length, mx  = time[0],mn = time[0];
        for(int ii = 0; ii < time.length ; ii++){
            mn = (int) Math.min(mn,time[ii]);
            mx = (int) Math.max(mx,time[ii]);
        }
        
        j*=time[n-1];
        solve(i,j,time,totalTrips);
        return ans;
    }
}