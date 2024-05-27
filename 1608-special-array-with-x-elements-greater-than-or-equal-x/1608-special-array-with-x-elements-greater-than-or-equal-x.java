class Solution {
    
    public int binarySearch(int key , int[] nums){
        int i = 0 , n = nums.length , j =0;
        j = n-1;
        int ind = -1;
        while( i <= j ){
            int mid = i+j;
            mid/=2;
            int num = nums[mid];
            if( num < key ){
                i = mid + 1;
            }else{
                ind = mid;
                j = mid - 1;
            }
        }
        // System.out.println(ind+" for key"+ key);
        if( ind == -1 )
            return -1;
        return n - ind;
    }
    
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] ar = new int[n+4];
        Arrays.sort(nums);
        int ans = -1;
        for(int i = 0 ; i < n +4 ; i++ ){
            int ret = binarySearch( i , nums);
            System.out.println(ret+" "+i);
            if( ret == i ){
                ans = i;
                break;
            }
        }
        
        return ans;
    }
}

/*

[3,6,7,7,0]
[3,5]
[0,0]
[0,4,3,0,4]
[1,2,3,4,5,6]
[1,2,3,4,5,6,1,2,3,4,5,6]
[1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4]
*/