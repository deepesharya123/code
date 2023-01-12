
class Solution {
        private static final Comparator<String> comp = (a, b) -> {

        String id = "";
        String content = "";
        id = a.substring(0,a.indexOf(" "));
        content = a.substring(a.indexOf(" ")+1);
        
        String id1 = "";
        String content1 = "";
        id1 = b.substring(0,b.indexOf(" "));
        content1 = b.substring(b.indexOf(" ")+1);
        
        if(content.equals(content1)){
            return id.compareTo(id1);
        }else{
            return content.compareTo(content1);
        }
            
        
    };
    
    public String[] reorderLogFiles(String[] logs) {
        int n = logs.length;
        int i = 0;
        List<String> digit = new ArrayList<>();
        ArrayList<String> letter = new ArrayList<String>();
        for(i=0;i<n;i++){
            String s =""+ logs[i];
            if(s.charAt(s.indexOf(" ")+1)>='0' && s.charAt(s.indexOf(" ")+1)<='9'){
                digit.add(new String(s));
            }else{
                letter.add(s);        
            }
        }
        Collections.sort(letter,comp);
        String[] ans = new String[n];
        for(i=0;i<n;i++){
            String s = "";
            if(i<letter.size()){
                s = (String) letter.get(i);
            }else{
                s = (String) digit.get(i-letter.size());
            }
            ans[i]=s;
        }
        return ans ;
    }
}