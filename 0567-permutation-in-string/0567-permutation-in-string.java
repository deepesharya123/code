class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            char c = s1.charAt(i);
            int val = map.getOrDefault(c,0);
            map.put(c,val+1);
        }
        HashMap<Character,Integer> originalMap = new HashMap<>();
        originalMap.putAll(map);
        int i =0, j=0;
        int count = map.size(), totalCount = s1.length();
        while(j<s2.length()){
            char c = s2.charAt(j);
            if(map.containsKey(c)){
                int val = map.get(c);
                map.put(c,val-1);
                totalCount--;
                if(val==1){
                    count--;
                    map.remove(c);
                }
                if(totalCount==0)
                    return true;
            
                j++;
            }else if(!map.containsKey(c) && totalCount<s1.length()){
                // System.out.println(map+" "+originalMap+" "+totalCount+" "+c);
                
                map.putAll(originalMap);
                totalCount = s1.length();
                i++;
                j=i;
                // System.out.println(map+" "+originalMap+" "+totalCount+" "+c);
                
            }else
                j++;
            
            // System.out.println(j);
        }
        
        
        
        return false;
    }
}



/*


"ab"
"eidboaoo"
"ab"
"aaaaaaaccccbbbbbb"
"a"
"zxcvzxcv"
"hello"
"ooolleoooleh"
"adc"
"dcda"
"qff"
"ifisnoskikfqzrmzlv"


*/