class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums )
            hm.put(num, hm.getOrDefault(num,0)+1);
        
        int ans = 0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet() ){
            int num = entry.getKey();
            int freq = entry.getValue();
            if( freq % 3 == 0 )
                ans+=(freq/3);
            else if( (freq-2) > 0 && (freq-2) % 3 == 0)
                ans+=( 1 + (freq-2)/3);
            else if( (freq-4) > 0 &&  (freq-4)% 3 == 0 )
                ans+=(2+(freq-4)/3);
            else if( freq%2 == 0 )
                ans+=freq/2;
            else
                return -1;
        }
        
        return ans;
    }
}