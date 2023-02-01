class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String ans = "",s  = "", l ="";
        int n = str1.length(), m = str2.length();
        if(n>m){
            l+=str1;
            s+=str2;
        }else{
            l+=str2;
            s+=str1;
        }
        int i = 0;
        String prefix = "";
        for(i=0;i<s.length();i++){
            char c = s.charAt(i);
            boolean presentInS = true, presentInL = true;
            prefix+=c;
            int j = 0, ip = 0, is =0;
            for(j=0;j<s.length();j++){
                char c1 = prefix.charAt((ip)%prefix.length()), c2 = s.charAt(j);
                if(c1!=c2){
                    presentInS = false;
                    break;
                }
                if(ip%prefix.length()!= j%prefix.length()){
                    presentInS = false;
                }
                ip++;
            }
            if( ip%prefix.length()!=0  ){
                    presentInS = false; 
                }
            if(presentInS){
                ip =0;
                for(j=0;j<l.length();j++){
                    char c1 = prefix.charAt((ip)%prefix.length()), c2 = l.charAt(j);
                    if(c1!=c2){
                        presentInL = false;
                        break;
                    }  
                    ip++;
                }
                
                if( ip%prefix.length()!=0  ){
                    presentInL = false; 
                }
                if(presentInL && prefix.length()> ans.length()){
                    ans="";
                    ans+=prefix;
                }
            }
            
        }
        
        return ans;
    }
}

/*

"ABCABC"
"ABC"
"ABABAB"
"ABAB"
"LEET"
"CODE"
"TAUXXTAUXXTAUXXTAUXXTAUXX"
"TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"

*/