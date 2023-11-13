class Solution {
    public String sortVowels(String s) {
        TreeMap<Character,Integer> hm = new TreeMap();
        char[] car = new char[s.length()];
        int len = s.length();
        int i = 0;
        for(char c: s.toCharArray()){
            if( c== 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u' || c== 'A' || c == 'E' || c == 'I' || c== 'O' || c == 'U'   ){
                hm.put(c, hm.getOrDefault(c,0)+1);
                car[i] = ' ';
            }else
                car[i] = c;
            i++;
        }
        System.out.println(hm);
        
        String ans = "";
        for(char c: car){
            if(c == ' '){
                char cc = (char)hm.firstKey();
                hm.put(cc, hm.get(cc) -1);
                if(hm.get(cc) == 0)
                    hm.remove(cc);
                ans+=cc;
            }else
                ans+=c;
        }
        return ans;
        
    }
}