class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0, n = nums.length;
        int i = 0,sum=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(i=0;i<n;i++){
            sum+=nums[i];
            int rem = sum%k;
            if(rem<0){
                rem = k+rem;
            }
            if(mp.containsKey(rem))
                ans+=(int) mp.get(rem);
            mp.putIfAbsent(rem,0);
            mp.put(rem,(int) mp.get(rem)+1);
        }
        
        return ans;
    }
}