class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,new Comparator<int[]>(){
            @Override
            public int compare(final int[] a , final int[] b ){
                return a[0]-b[0];
            }
        });
        int i = 0;
        int n = points.length;
        int mn = Integer.MAX_VALUE, mx = Integer.MIN_VALUE;
        int arrows = 0;
        arrows++;
        mn = points[0][0];
        mx = points[0][1];
        for(i=1;i<n;i++){
            int x = points[i][0], y = points[i][1];
            if((x>=mn && x<=mx) || (y>=mx && y<=mn)){
                mn = Math.max(mn,x);
                mx = Math.min(mx,y);
            }else{
                mn = x;
                mx = y;
                arrows++;
            }
        }
        return arrows;
        
    }
}