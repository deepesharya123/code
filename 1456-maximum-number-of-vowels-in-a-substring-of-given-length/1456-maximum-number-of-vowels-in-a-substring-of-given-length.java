class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int temp = 0;
        int i = 0, j = 0;
        HashSet<Integer> vowels = new HashSet<>();
        while( j < s.length() ){
            char c = s.charAt(j);
            if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowels.add(j);
                temp++;
            }
            if(j - i +1 < k)
                j++;
            else{
                ans = Math.max(ans , temp);
                if(vowels.contains(i)){
                    vowels.remove(i);
                    temp--;
                }
                i++;
                j++;
            }
        }
        
        return ans;
    }
}