class Solution {
    public boolean wordPattern(String pattern, String s) {
        boolean ans =true;
        HashMap<Character,String> map = new HashMap<>();
        
        String ss = "";
        int words =0;
        int j = 0;
        for(int i =0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            while(j<s.length()&& s.charAt(j)!=' '){
                ss+=s.charAt(j);
                j++;
            }
            j++;
            if(j<=s.length())
            words++;
            
            String comp =(String) map.getOrDefault(c,"");
           
            if( (map.containsValue(ss) && !map.containsKey(c)) || ( comp.length()>0&&!comp.equals(ss)))
                    return false;
            if(comp.length()==0)
                map.put(c,ss); 
            
            
            ss="";
        }
         while(j<s.length()){
             if(s.charAt(j)==' ')
                 words++;
                j++;
            }
               words++;
        

        if(words!=pattern.length())  return false;
        return true;
    }
}