class Solution {
    public int numberOfSubstrings(String s) {
//         Better approach with respect to space
        int ans = 0, lo = 0, hi=0, n = s.length();
        int[] count = new int[3];
        for(hi=0;hi<n;hi++){
            count[s.charAt(hi)-'a']++;
            
            while(count[0] >0 && count[1]>0 && count[2]>0){
                ans+=(n-hi);
                count[s.charAt(lo++)-'a']--;
            }
        }
        
        return ans;
    }
}