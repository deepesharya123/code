class Solution {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num: nums){
            int req1 = num - k, req2 = k + num;
            if(hm.containsKey(req1))
                ans+=hm.get(req1);
            if(hm.containsKey(req2))
                ans+=hm.get(req2);
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        return ans;
    }
}