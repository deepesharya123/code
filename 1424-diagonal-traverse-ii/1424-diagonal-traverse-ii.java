class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        int siz = 0 ;
        for(int i = 0 ; i < nums.size() ; i++){
            for(int j = 0 ; j < nums.get(i).size() ; j++){
                if( !hm.containsKey(i+j) )
                    hm.put(i+j, new ArrayList<>());
                hm.get(i+j).add(0,nums.get(i).get(j));
                siz++;
            }
        }
        int[] ans = new int[siz];
        int count = 0, i = 0;
        while( hm.containsKey(count) ){
            for(int num : hm.get(count)){
                ans[i++] = num;
            }
            count++;
        }
        return ans;
     }
}