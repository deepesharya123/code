class Solution {
    static int[][] t = new int[1002][1002];
    private static int lcs(String s, String p, int sl, int pl){
        if( sl==0 || pl==0 )
            return 0;

        if(t[sl][pl]!=-1)   return t[sl][pl];

        if(s.charAt(sl-1)==p.charAt(pl-1))
            t[sl][pl] = 1+lcs(s,p,sl-1,pl-1);
        else
            t[sl][pl] = Math.max(lcs(s,p,sl-1,pl),lcs(s,p,sl,pl-1));
        return t[sl][pl];
    }

    public int longestCommonSubsequence(String text1, String text2) {
        for(int i = 0;i<1002;i++)
            for(int j = 0;j<1002;j++)   
                t[i][j]=-1;
        return lcs(text1,text2,text1.length(),text2.length());
    }
}