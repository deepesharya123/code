class Solution {
    public int findMinArrowShots(int[][] points) {
        int ans = 1 , n = points.length;
        int[] cur = new int[2];
        Arrays.sort(points , (a,b) -> a[0]-b[0]);
        cur[0] = points[0][0];
        cur[1] = points[0][1];
        for(int i = 1 ; i < n ; i++ ){
            int xs = points[i][0] , xe = points[i][1];
//             xs is in between the cur, while xe is outside the range of cur
            if( (xs >= cur[0] && xs <= cur[1]) || (xe >= cur[1] && xe <= cur[0] )){
                cur[0] = Math.max(cur[0] , xs);
                cur[1] = Math.min(cur[1] , xe);
                continue;
            }
            ans++;
            cur[0] = xs;
            cur[1] = xe;
        }
        return ans;
    }
}