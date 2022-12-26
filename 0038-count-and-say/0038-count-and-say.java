class Solution {
    static String countAndSayAns = "";
    public static void solve(String base,String ans, int n){
        if(n==1){
            countAndSayAns+=base;
            return;
        }
        
        int count = 0;
        char c = base.charAt(0);
        int i = 1;
        count++;
        String anotherBase = "";
        
        while(i<base.length()){
            if(base.charAt(i)==c){
                count++;
            }else{
                int cc = count;
                    anotherBase+=cc;
                    anotherBase+=c;
                count = 1;
                c = base.charAt(i);
            }
            i++;
        }
        int cc = count;        
            anotherBase+=cc;
            anotherBase+=c;
            
        base="";
        solve(base+anotherBase,ans,n-1);
    }
    
    public String countAndSay(int n) {
        String ans = "";
        String base = "1";
        countAndSayAns = "";
        solve(base,ans,n);
        return  countAndSayAns;
    }
}