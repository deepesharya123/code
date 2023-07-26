class Solution {
    
    public boolean isValid(double mid, int[] dist , double hour){
        double time = 0;
        for(int i = 0 ; i < dist.length-1; i++){
            int dis = dist[i];
            double add = dis;
            add = add/mid;
            double ceil = Math.ceil(add);
            // System.out.println(add+" "+ceil+" "+dis+" cal  "+mid);
            time+=Math.ceil(add);
        }
        double add = dist[dist.length-1];
        add = add/mid;
        time+=add;
        // System.out.println(time+" "+hour+" "+mid);
        return time<=hour;
    }
    
    
    public int minSpeedOnTime(int[] dist, double hour) {
        int i = 0, j = dist.length - 1;
        int ans = -1;
        for(int dis : dist)
             j = Math.max(j,dis);
        // j*=(dist.length*j);
        j = 10000003;
        // System.out.println(j);
        while(i < j){
            int speed = i + (j-i)/2;
            
            if(isValid(speed, dist,hour)){
                ans = speed;
                j = speed;
            }else{
                i = speed+1;
            }
        }
        return ans;
    }
}


/*


[1,3,2]
6
[1,3,2]
16
[1,3,2]
2.7
[1,3,2]
1.9
[1,3,2]
2.1





*/