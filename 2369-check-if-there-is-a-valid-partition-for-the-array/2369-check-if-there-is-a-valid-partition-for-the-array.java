class Solution {
    
    
    boolean[] dp = new boolean[100005];
    // boolean[][] equals= new boolean[100005][2];
    // boolean[] increased = new boolean[100005];
    
    public boolean equal(int i, int j , int[] nums){
        int ii = i;
        if(nums.length < j)
            return false;
        
        while(i < j  ){
            if(nums[ii] != nums[i])
                return false;
            i++;
        }
        
        return true;
    }
    
    public boolean increasing(int i, int j, int[] nums){
        int pre = nums[i];
        
        if(nums.length < j)
            return false;
        
        i++;
        while(i < j ){
            if(nums[i] != pre+1)
                return false;
            pre = nums[i];
            i++;
        }
        
        return true;
        
    }
    Map<Integer, Boolean> memo = new HashMap<>();
    public boolean solve(int i, int[] nums){
        int n = nums.length;
        if( i >= n )
            return true;
        if(memo.containsKey(i) )
            return memo.get(i);
        
        memo.put(i,true);
        boolean two = equal(i,i+2, nums) && solve(i+2,nums) ; 
        // System.out.println(i+ " two "+two);
        if(two)
            return two;
        boolean three = equal(i,i+3,nums) && solve(i+3, nums) ;
        // System.out.println(i+" three 1 "+ three);
        if(three)
            return true;
        three = increasing(i,i+3, nums) && solve(i+3,nums);
        // System.out.println(i+" three 2 "+ three);
        if(three) return true;
        memo.put(i,false);
        return false;
    }
    
    public boolean validPartition(int[] nums) {
        boolean ans = solve(0,nums);
        return ans;
    }
}

/*

[4,4,4,5,6]
[1,1,2,3,4]
[1,1,1,2]
[1,1]
[1,2]
[1,1212]
[1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12]
[1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12]
[1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12]
[1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12,12,1]


*/