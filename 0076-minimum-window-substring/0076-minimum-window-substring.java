class Solution {
    public String minWindow(String s, String t) {
        int st = -1,e = -1;
        String ans = "";
        int i  = 0,j=0;
        HashMap h = new HashMap();
        for(i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(h.containsKey(c)){
                int val =(int) h.get(c);
                h.put(c,val+1);
            }else
                h.put(c,1);
        }
        int count = h.size();
        i=0;
        while(j<s.length()){
            char c = s.charAt(j);
            if(h.containsKey(c)){
                int val =(int) h.get(c);
                h.put(c,val-1);
                if(val-1==0) count--;
            }
            
            if(count==0){
                if(st>=0){
                    if((e-st+1)>(j-i+1)){
                        st=i;
                        e=j;   
                    }
                }else{
                    st = i;
                    e = j;
                }  

                while(count==0&&i<=j){
                    char cc = s.charAt(i);
                    if(h.containsKey(cc)){
                        int val = (int) h.get(cc);
                        h.put(cc,val+1);
                        if(val==0) count++; 
                    }
                    if((e-st+1)>(j-i+1)){
                        st=i;
                        e=j;
                    }
                    i++;
                    
                } 
                
            } //
            j++;
        }
            
        if(st>-1&&e>=0)
            ans+=s.substring(st,e+1);
        return ans;
    }
}