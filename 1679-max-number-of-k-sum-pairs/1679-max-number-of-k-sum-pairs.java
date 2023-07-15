class Solution {
    public int maxOperations(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums){
            int req = k - num;
            if(hm.containsKey(req)){
                ans++;
                hm.put(req, hm.get(req)-1);
                if(hm.get(req)==0)
                    hm.remove(req);
                continue;
            }else
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        
        return ans;
    }
}

/*

[1,2,3,4]
5
[3,1,3,4,3]
6

*/