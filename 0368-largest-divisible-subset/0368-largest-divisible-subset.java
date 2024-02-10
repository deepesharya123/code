class Solution {
    List<Integer> res = new ArrayList<>();
    int[] dp ;
    public void solve(int [] nums, int ind, int prevNum , List<Integer> temp ){
        int  n = nums.length;
        if( ind == n ){
            // System.out.println(temp);
            if( res.size() < temp.size() )
                res  = new ArrayList<>(temp);
            return;
        }
        int cur = nums[ind];
        if( dp[ind] < temp.size() && (cur % prevNum == 0 || prevNum % cur == 0) ){
            dp[ind] = temp.size();
            temp.add(cur);
            solve(nums,ind+1, cur, temp);
            temp.remove(temp.indexOf(cur));
        }
        solve(nums,ind+1,prevNum,temp);
    }
    
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        dp = new int[nums.length+3];
        Arrays.fill(dp,-1);
        solve(nums, 0 ,1 ,new ArrayList<>());
        return res;
    }
}