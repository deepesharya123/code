class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int[][] mat = new int[n][2];
        for(int i = 0 ; i < n ; i++ ){
            mat[i][0] = i;
        }
        for(int[] edge : roads ){
            mat[edge[0]][1]++;
            mat[edge[1]][1]++;
        }
        Arrays.sort(mat , (a,b)-> (a[1] - b[1]));
        
        long ans = 0 , k = 1;
        for(int[] ar : mat ){
            ans += (ar[1] * k);
            k++;
        }
        
        
        return ans;
    }
}