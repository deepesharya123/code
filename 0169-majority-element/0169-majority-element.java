class Solution {
    public int majorityElement(int[] nums) {
        int count = 0 , m = 0 ;
        for(int num : nums ){
            if( count == 0 ){
                m = num;
            }
            
            if( m == num ){
                count++;
            }else
                count--;
        }
        return m;
    }
}