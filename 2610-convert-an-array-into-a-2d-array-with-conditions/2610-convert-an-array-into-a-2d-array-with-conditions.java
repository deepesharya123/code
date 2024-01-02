class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
//         number, last index of row where number was inserted
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for( int num : nums ){
            if( !hm.containsKey(num) ) {
                ans.get(0).add(num);
                hm.put(num,0);
            }else{
                int row = hm.get(num) +1 ;
                if( row < ans.size() ){
                    ans.get(row).add(num);
                    hm.put(num, row++);
                }else{
                    ans.add(new ArrayList<>());
                    ans.get(row).add(num);
                    hm.put(num, row++);
                }
            }
            
        }        
        return ans;
    }
}