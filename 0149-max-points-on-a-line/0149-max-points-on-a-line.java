class Solution {
    public int maxPoints(int[][] points) {
        int ans = 0;
        
        for(int i =0;i<points.length;i++){
            int x1 = points[i][0], y1 = points[i][1];
            for(int j =0;j< points.length;j++){
                if(i==j)
                    continue;
                int x2 = points[j][0], y2 = points[j][1];
                int con = 2;
                for(int k = 0;k<points.length;k++){
                    if(k==i || k==j )
                        continue;
                    int x = points[k][0], y= points[k][1];
                    if(((y-y2)*(x2-x1))==((y2-y1)*(x-x2)))
                        con++;
                }
                ans = Math.max(con,ans);
            }
        }
        if(points.length==1)
            return 1;
        
        return ans;
    }
}