class Solution {

    public int solve(int[] ar){
        int i = 0, j = ar.length -1;
        while(i < j){
            int mid = i + (j-i)/2;
            
            if(ar[mid] > ar[mid -1] && ar[mid] > ar[mid+1])
                return mid;
            
            if(ar[mid] > ar[mid-1])
                i = mid;
            else
                j = mid;
        }
        return i;
    }
    
    public int peakIndexInMountainArray(int[] arr) {
        return solve(arr);
    }
}