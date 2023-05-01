class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = nums[0] , b , c = Integer.MAX_VALUE;
        b=c;
        for(int i = 1; i <nums.length; i++){
            int num = nums[i]; 
            if(num <= a ) a = num;
            else if(num <= b) b = num;
            else return true;
        }
        return false;
    }
}