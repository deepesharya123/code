class Solution {
    
    
    public int jump(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,Integer.MAX_VALUE);
        res[0]=0;
        for(int i = 0;i<nums.length;i++){
            int j = nums[i], k = i+1;
            while(j-->0 && k< nums.length){
                res[k] = Math.min(res[k],res[i]+1);
                k++;
            }
            
        }
        
        return res[nums.length-1];
    }
}