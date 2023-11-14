class Solution {
    public int countPalindromicSubsequence(String s) {
        List<List<Integer>> indices = new ArrayList<>();
        for(int i = 0 ; i < 26 ; i++ )
            indices.add(new ArrayList<>());
        
        for(int i = 0 ;  i < s.length() ; i++){
            char c = s.charAt(i);
            int ind = c - 'a';
            indices.get(ind).add(i);
        }
        int ans = 0 ;
        // System.out.println(indices);
        for(int i  = 0 ; i < 26 ; i++){
            int temp = 0 ;
            if( indices.get(i).size() >= 2 ){
                if( indices.get(i).size() > 2 )
                    temp++;
                int mn = indices.get(i).get(0), mx = indices.get(i).get( indices.get(i).size() - 1 );
                for(int j = 0  ; j < 26 ; j++ ){
                    if( indices.get(j) == null || i == j )
                        continue;
                    for(int k = 0 ;  k < indices.get(j).size() ; k++){
                        int num = indices.get(j).get(k);
                        if( num > mn && num < mx){
                            temp++;
                            break;
                        }
                    }
                }
            }         
            ans+=temp;
        }
        
        return ans;
    }
}