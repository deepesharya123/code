class Solution {
    public int findMaxLength(int[] nums) {
        int ans = 0;
        int n = nums.length, count = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();    

        for(int i = 0 ; i < n  ; i++ ){
            int num = nums[i];
            if( num == 0 )
                count--;
            else
                count++;
            
            if( count == 0 )
                ans = Math.max(ans, i + 1 );
            else if( map.containsKey(count) ){
                ans = Math.max(i - map.get(count) , ans);
            }else
                map.put(count, i );
            
        }
        
        return ans;
    }
}