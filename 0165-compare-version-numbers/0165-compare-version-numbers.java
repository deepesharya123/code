class Solution {
    public int compareVersion(String version1, String version2) {
        int ans = 0 , i = 0 , j = 0;
        while( true ){
            String s = "" , p = "";
            
            while( i < version1.length() && version1.charAt(i) != '.')
                s+=version1.charAt(i++);
            i++;
            while( j < version2.length() && version2.charAt(j) != '.')
                p+=version2.charAt(j++);
            j++;
            if( s.length() == 0 )
                s+="0";
            if( p.length() == 0 )
                p+="0";
            int ns = Integer.parseInt(s);
            int np = Integer.parseInt(p);
            
            if( ns < np )
                return -1;
            if( ns > np )
                return 1;
            if( i >= version1.length() && j >= version2.length() )
                break;
        }
        
        return ans;
    }
}