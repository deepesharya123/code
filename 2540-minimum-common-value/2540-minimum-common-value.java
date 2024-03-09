class Solution {
    
    public int bs(int[]ar , int x){
        int n = ar.length;
        int i = 0 , j = n-1;
        while( i <= j ){
            int mid = i + (j-i)/2;
            int num = ar[mid];
            if( num == x ) 
                return i;
            
            if( num > x )
                j = mid - 1 ;
            else
                i = mid + 1;
        }
        return -1;
    }
    
    public int getCommon(int[] nums1, int[] nums2) {
        int ans = Integer.MAX_VALUE;
        for(int num : nums1 ){
            int found = bs(nums2, num );
            if( found >= 0 ){
                ans = num;
                break;
            }
        }
        return ans == Integer.MAX_VALUE ? -1  : ans;
    }
}

/*

[1,2,3]
[2,4]
[1,2,3,6]
[2,3,4,5]
[1,2,3,4,56]
[6,7,8,8]
[1,2]
[2]

*/