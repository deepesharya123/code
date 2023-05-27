class Solution {
    List<List<Integer>> ans = new ArrayList();
    
    public void solve(int[] nums, int ind, List<Integer> temp){
        int n = nums.length;
        if(ind>= n){
            ans.add(new ArrayList(temp));
            return;
        }
            
//         discard current element
        solve(nums, ind+1, temp);
//          include current index
        temp.add(nums[ind]);
        solve(nums, ind+1, temp);
        temp.remove(temp.indexOf(nums[ind]));
    }
    
    public long maxStrength(int[] nums) {
        long res = Integer.MIN_VALUE;
        solve(nums, 0, new ArrayList());
        for(List<Integer> list : ans){
            if(list.size() == 0)
                continue;
            long sum = list.get(0);
            for(int i = 1 ; i < list.size(); i++)
                sum*=list.get(i);
            res = Math.max(res,sum);
        }
        return res;
    }
}

/*

[-4,-5]
[3,-1,-5,2,5,-9]
[3,-1,-5,2,5,-9,1,2,3,4,5,6,7]
[0,-1]



*/