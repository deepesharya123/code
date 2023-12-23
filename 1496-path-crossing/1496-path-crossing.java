class Solution {
    public boolean isPathCrossing(String path) {
        int[] point = {0,0};
        HashSet<String> set = new HashSet<>();
        for(char c : path.toCharArray() ){
            String k = point[0]+"-"+point[1];
            set.add(k);
            if( c == 'N' )
                point[1]++;
            else if( c == 'S' )
                point[1]--;
            else if( c == 'E' )
                point[0]++;
            else
                point[0]--;
        
            String kk = point[0]+"-"+point[1];
            if( set.contains(kk) )
                return true;
            
        }
        return false;
    }
}