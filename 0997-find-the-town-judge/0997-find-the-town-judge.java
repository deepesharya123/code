class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] people = new int[n+1];
        int[] trusting = new int[n+1];
        for(int[] ar : trust ){
            people[ar[1]]++;
            trusting[ar[0]]++;
        }
        int ret = 0;
        for(int i = 1 ; i < n+1; i++ ){
            if( people[i] == n-1 && trusting[i] == 0 )
                return i;
        }
        return -1;
    }   
}