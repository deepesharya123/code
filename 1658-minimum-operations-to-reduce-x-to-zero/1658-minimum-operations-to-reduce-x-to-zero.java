class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int num : nums)
            sum+=num;
        
        int k = sum - x;
        // System.out.println(k+" is the k");
        int len = -1;
        int temp = 0;
        int i = 0, j = 0;
        int n = nums.length;
        while( j < n && i < n){
            temp+=nums[j];
            // System.out.println(temp+"__"+i+"__"+j);
            while(temp > k  && i < n){
                temp-=nums[i++];
            }
            
            // System.out.println(temp+"__"+i+" check "+j);
            if(temp == k) {
                len = Math.max(len, j- i +1);
                if(i < n) temp-=nums[i++];
            }
            j++;
            // System.out.println(len);
        }
        return len < 0 ? len : n-len;
    }
}