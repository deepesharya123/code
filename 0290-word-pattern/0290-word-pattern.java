class Solution {
    public boolean wordPattern(String pattern, String s) {
        boolean ans =true;
        HashMap<String,String> map = new HashMap<>();
        HashMap<String,String> map2 = new HashMap<>();
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
            String comp =(String) map.getOrDefault(""+c,"");
            if(comp.length()==0)
                map.put(""+c,ss);
            else{
                if(!comp.equals(ss))
                    return false;
            }
            String charComp = map2.getOrDefault(ss,"");
            if(charComp.length()==0){
                map2.put(ss,""+c);
            }else{
                if(!charComp.equals(""+c))
                    return false;
            }
            
            ss="";
        }
         while(j<s.length()){
             if(s.charAt(j)==' ')
                 words++;
                j++;
            }
               words++;
        // System.out.println(s+" "+words);

        if(words!=pattern.length())  return false;
        return true;
    }
}