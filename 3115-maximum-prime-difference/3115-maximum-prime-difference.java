class Solution {
    
    int[] prime = new int[103];
    
    public void primeCal(){
        
        for(int i = 2 ; i < 103 ; i++ ){
            if( prime[i] == -1 ){
                prime[i] = 1;
                for(int j = i+i ; j < 103 ; j+=i) 
                    prime[j] = 0;
            }
        }
    }
    
    public int maximumPrimeDifference(int[] nums) {
        Arrays.fill(prime, -1) ;
        prime[0] = prime[1] = 0;
        primeCal();
        
        int ans = 0;
        int first = nums.length + 1 , last = -1;
        
        for(int i = 0 ; i < nums.length ; i++ ){
            int num = nums[i];
            if( prime[num] == 1 ){
                if( first == nums.length + 1)
                    first = i;
                
                last = i;
            }
        }
        ans = last- first;
        return ans;
    }
}