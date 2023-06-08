class Solution {

    public int lastPositive(int[] ar){
        int n = ar.length;
        int i = 0, j = n-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(ar[mid] < 0 )
                j = mid - 1;
            else
                i = mid + 1;
        }
        return i;
    }
    
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for(int[] ar: grid){
            int n = ar.length;
            int ans = lastPositive(ar);
            if(n-ans!=-1)
            sum+=n-ans;
        }
        return sum;
    }
}