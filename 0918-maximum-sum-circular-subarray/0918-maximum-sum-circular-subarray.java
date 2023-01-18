class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        int total = 0;
        int max_ending_here = 0;
        int min_ending_here = 0;
        for (int num : nums) {
            total += num;
            max_ending_here = Math.max(max_ending_here + num, num);
            max_sum = Math.max(max_sum, max_ending_here);
            min_ending_here = Math.min(min_ending_here + num, num);
            min_sum = Math.min(min_sum, min_ending_here);
        }
        
        return max_sum > 0 ? Math.max(max_sum, total - min_sum) : max_sum;
    }
}