class Solution {
    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a%b);
    }
    public long countPairs(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            int tempGCD = num > k ? gcd(num,k) : gcd(k,num);
            for(Map.Entry<Integer,Integer> me : hm.entrySet()){
                int factor = me.getKey(), v = me.getValue();
                if((long) tempGCD * factor % k == 0)
                    ans+=v;
            }
            hm.put(tempGCD, hm.getOrDefault(tempGCD,0)+1);
        }
        return  ans;
    }
}