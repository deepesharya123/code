class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm  = new HashMap<>();
        hm.put(0,0);
        if(nums.length < 2) 
            return false;
        int sum = 0;
        // hm.put(0,-1);
        for( int  i = 0;i < nums.length; i++){
            int num = nums[i];
            sum+=num;
      
            if(hm.containsKey(sum%k)){
                if(hm.get(sum%k)  < i )
                    return true;
            }else
                hm.put(sum%k, i+1);
            
        }
        return false;
    }
}