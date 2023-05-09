class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum = 0;
        for(int num : nums){
            sum+=num;
            int rem = sum%k;
            if(rem <0)
                rem = k+rem;
            if(hm.containsKey(rem))
                ans+=hm.get(rem);
            hm.put(rem, hm.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}