class Solution {
    Set<List<Integer>> ans = new HashSet<List<Integer>>(); 
    
    public void solve(int ind,int[] nums, List<Integer> li){
        int n = nums.length;
        
        if(li.size()>1)
            ans.add(new ArrayList<>(li));
        
        if(ind == n){
            return ;
        }
        
        
        
        int last = (int) li.get(li.size()-1);
        for(int j = ind ; j< n; j++){
            if(nums[j]<last)
                continue;
            // System.out.println(li+" "+ind+" "+j)
            li.add(nums[j]);
            if(li.size()>1)
                ans.add(new ArrayList<>(li));
            solve(j+1,nums,li);
            li.remove(li.indexOf(nums[j]));
        }
        
        
        
    }
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        for(int i = 0;i< nums.length;i++){
            List<Integer> li = new ArrayList<>();
            li.add(nums[i]);
            solve(i+1,nums,li);
        }
        System.out.println(ans +" "+ans.size());
        for(List<Integer> list: ans)
            ret.add(list);
        
        return ret;
    }
}