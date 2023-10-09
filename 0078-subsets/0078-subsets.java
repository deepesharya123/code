class Solution {
    
    public void solve(List<Integer> temp, List<List<Integer>> ans,int[] nums, int ind){
        if( ind == nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        
//         include the elemtn
        
        temp.add(nums[ind]);
        solve(temp, ans, nums, ind+1);
        
        
//         remove the current elemtn
        temp.remove(temp.indexOf(nums[ind]));
        solve(temp, ans, nums, ind+1);
        return ;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(temp,ans, nums, 0);
        return ans;
    }
}