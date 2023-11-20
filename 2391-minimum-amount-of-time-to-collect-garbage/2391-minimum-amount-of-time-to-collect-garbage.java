class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int gi = -1, pi = -1,mi = -1;
        int i = 0 , n = garbage.length;
        int g = 0 , p = 0, m = 0 ;
        int cg = 0, cp = 0 ,cm = 0;
        for(i = 0 ; i < n ; i++ ){
            String s = garbage[i];
            for( char c : s.toCharArray()){
                if( c == 'G'){
                    gi = i ;
                    cg++;
                }
                else if( c == 'P' ){ 
                    pi = i;
                    cp++;
                }
                else {
                    mi = i;
                    cm++;
                }
            }
        }
        
        for(i = 0 ; i < n-1 ; i++){
            int time = travel[i];
            if( i < gi )
                g+=time;
            
            if( i < pi )
                p+=time;
            
            if( i < mi )
                m+=time;
            
            if( !( i < gi || i < pi || i < mi ))
                break;
        }
        int ans = g + p + m + cg + cp + cm;
        return ans;
    }
}