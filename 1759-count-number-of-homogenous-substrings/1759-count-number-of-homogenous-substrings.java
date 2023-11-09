class Solution {
    public int countHomogenous(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int i = 0 , n = s.length() , j = 0 , ans = 0, mod = (int) (1e9);
        mod+=7;
        while( j < n ){
            int temp = 0;
            char c = s.charAt(j);
            hm.put(c , hm.getOrDefault(c,0) +1);
            int len = j - i + 1;
            if( hm.size() == 1){
                temp+=len;
            }else{
                while( hm.size() > 1){
                    char rm = s.charAt(i);
                    hm.put(rm, hm.get(rm) -1);
                    if( hm.get(rm) == 0 )
                        hm.remove(rm);
                    i++;
                }
                len = j - i + 1;
                temp += len;
            }
            j++;
            ans+=temp;
            ans%=mod;
        }
        return ans;
        
    }
}