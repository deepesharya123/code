class Solution {
    int[] parent = new int[26];
    
    public void makeParent(char c1, char c2){       // c1 < c2
        int par2 = parent[c2-'a'];
        int par1 = parent[c1-'a'];
        
        char mxchar = (char)(par1+'a' > par2+'a' ? par1+'a' : par2+'a');
        char mnchar = (char)(par1+'a' > par2+'a' ? par2+'a' : par1+'a');

        for(int i = 0;i<26;i++){
            if(parent[i]==par2 || parent[i]==par1 || 
                parent[i]==(c1-'a') || parent[i]==c2-'a')
                parent[i] = mnchar-'a';
        }
     
    }
    
    public int findParent(int p){
        int pp = parent[p];
        if(pp==p)
            return p;
        return findParent(pp); 
    }
    
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int i = 0;
        for(i=0;i<26;i++){
            parent[i]=i;
        }
        for(i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1<c2){
                makeParent(c1,c2);
            }else{
                makeParent(c2,c1);
            }
        }
        String ans = "";
        
        for(i=0;i<baseStr.length();i++){
            char c = baseStr.charAt(i);
            char ccc = (char)(c-'a');
            char par = (char) ( findParent(parent[(int)(c-'a')]) +'a' );
            ans+=par;
        }
        return ans;
    }
}

/*

"parker"
"morris"
"parser"
"hello"
"world"
"hold"
"leetcode"
"programs"
"sourcecode"

*/