class Solution {
    public int partitionString(String s) {
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        int i =0, j =0;
        while(j < s.length()){
            char c = s.charAt(j);
            map.put(c, 1 + map.getOrDefault(c,0));
            count++;
            if(count == map.size()){
                j++;    
            }else{
                ans++;
                count = 1;
                map.clear();
                map.put(c,1);
                j++;
            }
        }
        return ans+1;
    }
}