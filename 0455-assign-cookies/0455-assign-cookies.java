class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0 , j = 0;
        int n = g.length , m = s.length;
        int ans = 0;
        while( i < n && j < m  ){
            if( s[j] >= g[i] ){
                ans++;
                i++;
                j++;
            }
            else if( s[j] < g[i] )
                j++;
            else
                i++;
        }
        return ans;
    }
}

/*

[10,9,8,7]
[5,6,7,8]

*/