class Solution {
    public int findMaxK(int[] nums) {
        int ans = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int nu : nums ){
            int num = nu*-1;
            if( set.contains(num)){
                ans = Math.max(ans , Math.abs(nu));
            }
            set.add(nu);
        }
        return ans;
    }
}