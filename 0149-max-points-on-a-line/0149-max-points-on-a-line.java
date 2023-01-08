class Solution {
    public int maxPoints(int[][] points) {
        int ans = 1, n = points.length;
        for(int i = 0;i<n;i++){
            int x1 = points[i][0], y1 = points[i][1];
            int con = 0;
            HashMap<Double,Integer> map = new HashMap<>();
            for(int j = 0;j<n;j++){
                if(i==j)
                    continue;
                int x2 = points[j][0], y2 = points[j][1];
                double a = y2-y1;
                double b = x2-x1;
                double angle = a/b;
                map.put(angle,map.getOrDefault(angle,0)+1);
                ans = Math.max(map.get(angle)+1,ans);
            }
        }
        return ans;
    }
}