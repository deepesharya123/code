class Solution {
    
    public int digits(Long n){
        if(n<10)
            return 1;
        return 1+digits(n/10);
    }
    
    public boolean  isValid(List<Character> ch){
        String s = "";
        for(char c: ch){
            if(c=='.'){
                long num = (long) Long.parseLong(s);
                if(num > 255 || digits(num)!=s.length() ){
                    return false;
                }
                    
                s = "";
            }else{
                s+=c;
            }
        }
        long num = (long) Long.parseLong(s);
        if(num > 255 || digits(num) != s.length() )
            return false;

        return true;
    
    }
    
    public void solve(List<String> ans,List<Character> ch, int dots,int ind){
        
        if(dots == 0){
            if(isValid(ch))
                ans.add(ch.stream().map(String :: valueOf ).collect(Collectors.joining()));
            return;
        }
        
        for(int i = ind; i < ch.size()-1 ; i++){
            char c = (char) ch.get(i);
            if(c=='.')
                continue;
            ch.add(i+1,'.');
            solve(ans,ch,dots-1,i+2);
            ch.remove(i+1);
        }
        
    }
    
    public List<String> restoreIpAddresses(String s) {
        List<String> ans=  new ArrayList<>();
        if(s.length()>12 || s.length()<4 )
            return ans;
        char[] ar = s.toCharArray();
        List<Character> ch = new ArrayList<>();
        for(char c :ar)
            ch.add(c);
        
        solve(ans,ch,3,0);
        return ans;
    }
}