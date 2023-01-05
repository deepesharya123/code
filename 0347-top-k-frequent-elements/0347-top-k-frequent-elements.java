class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
//         num, Frequency
        PriorityQueue<Pair<Integer,Integer>> pq;
        pq = new PriorityQueue<>(( a, b)-> (b.getKey()-a.getKey()));
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0 , n = nums.length ;
        for(i=0;i<n;i++){
            int count = map.getOrDefault(nums[i],0);
            map.put(nums[i],count+1);
        }
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry me = (Map.Entry) itr.next();
            pq.add(new Pair(me.getValue(),me.getKey()));
        }
        // System.out.println(pq);
        i=0;
        while(k-->0){
            ans[i] = pq.peek().getValue();
            pq.remove();
            i++;
        }
        return ans;
    }
}