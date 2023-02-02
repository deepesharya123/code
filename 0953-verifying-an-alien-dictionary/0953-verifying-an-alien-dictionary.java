class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] digit = new int[26];
        int i = 0;
        for(i=0;i<order.length();i++){
            char c = order.charAt(i);
            digit[c-'a'] = i;
            int ind = c-'a';
        }
        boolean ans = true;
        for(i=1;i<words.length;i++){
            String cur = "", pre = "";
            cur+=words[i];
            pre+=words[i-1];
            boolean matchall = true;
            for(int j =0;j<Math.min(pre.length(),cur.length());j++){
                char c1 = pre.charAt(j), c2 = cur.charAt(j);
                if(c1==c2)
                    continue;
                matchall = false;
                if(digit[c1-'a']>digit[c2-'a']){
                    return false;
                }else
                    break;
            }
            if(matchall && cur.length()<pre.length())
                return false;
            
        }
        
        return ans;
    }
}