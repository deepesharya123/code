class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int  num : nums )
            xor ^= num;
        
        int mask = xor & -xor;
        int a = 0 , b = 0;
        for(int num : nums ){
            if( (num & mask) == 0 )
                a ^= num;
            else
                b ^= num;
        }
        
            return new int[]{ a , b };
    }
}