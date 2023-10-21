class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
//         value, index
        PriorityQueue<Pair<Integer,Integer>> max_heap = new PriorityQueue<>((a,b) -> b.getKey() -a.getKey() );
        
        max_heap.add(new Pair<>(nums[0],0));
        int ans = nums[0];
        
        
        for(int i = 1 ; i < nums.length ; i++){
            while( max_heap.size() > 0 && i - max_heap.peek().getValue() > k )
                max_heap.remove();
            
            int cur = Math.max(0 , max_heap.peek().getKey()) + nums[i];
            ans = Math.max(ans, cur);
            max_heap.add(new Pair(cur, i));
        }
        return ans;
    }
}
/*

*/