class Solution {
    public int minDeletionSize(String[] strs) {
        String[] ss = Arrays.copyOf(strs,strs.length);
        int ans = 0;
        for( int i =0;i<strs[0].length();i++){
            final int ii  = i;
            PriorityQueue<Character> pq = new PriorityQueue<>((s1, s2)-> (s1-s2));
            for(int j =0;j<strs.length;j++){
                pq.add(strs[j].charAt(i));
            }
            for(int j = 0;j<strs.length;j++){
                if(ss[j].charAt(i)!=(pq.remove())){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}