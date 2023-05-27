class Solution {
    public long maxStrength(int[] nums) {
        long res = 1;
        int largest = Integer.MIN_VALUE,neg = 0, largestNegative = Integer.MIN_VALUE;
        for(int num :  nums){
            if(num!=0)res*=num;
            if(num < 0){
                neg++;
                largestNegative = Math.max(largestNegative, num);
            }
            largest = Math.max(largest, num);
        }
        if(largest == 0 && neg < 2)  return 0;
        if(largest < 0 && neg == 1 ) return (largestNegative);
        if(res > 0) return res;
        return res/largestNegative;
    }
}