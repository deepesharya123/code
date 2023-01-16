class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n =  intervals.length, m = newInterval.length;
        int[][] allInterval = new int[n+1][2];
        int i = 0;
        for(i=0;i<n;i++){
            allInterval[i][0] = intervals[i][0];
            allInterval[i][1] = intervals[i][1];
        }
        allInterval[n][0] = newInterval[0];
        allInterval[n][1] = newInterval[1];
        
        Arrays.sort(allInterval,(a,b)-> a[0]-b[0]);
        int[] merge = new int[2];
        List<List<Integer>> ans = new ArrayList<>();
        merge[0] = allInterval[0][0];
        merge[1] = allInterval[0][1];
        for(i=1;i<n+1;i++){
            int x = allInterval[i][0], y = allInterval[i][1];
            if(x<=merge[1]){
                merge[1] = Math.max(merge[1],y);
            }else{
                List<Integer> l = new ArrayList<>();
                l.add(merge[0]);
                l.add(merge[1]);
                ans.add(l);
                merge[0] = x;
                merge[1] = y;
            }
        }
        List<Integer> l = new ArrayList<>();
        l.add(merge[0]);
        l.add(merge[1]);
        ans.add(l);

        int[][] ret = new int[ans.size()][2];
        for(i = 0;i<ans.size();i++){
            ret[i][0] = (int) ans.get(i).get(0);
            ret[i][1] = (int) ans.get(i).get(1);
        }
        return ret;
        
        
    }
}