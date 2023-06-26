class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> left = new PriorityQueue();
        PriorityQueue<Integer> right = new PriorityQueue();
        List<Integer> discard = new ArrayList();
        int i = 0 , n = costs.length;
        if(n >= 2*candidates){
            for(i = 0; i < n ; i++){
                int num = costs[i];
                if(i < candidates)
                    left.add(num);
                else if(i>=n-candidates)
                    right.add(num);
                else
                    discard.add(num);
            }
        }else{
            for(i = 0 ; i < n ; i++){
                int num = costs[i];
                if(i < candidates)
                    left.add(num);
                else
                    right.add(num);
            }
        }
        
       
        long ans = 0;
        while(k-- > 0){
            if(left.size() > 0 && right.size() > 0  ){
                if(left.peek() <= right.peek()){
                    int num = left.poll();
                    ans+=num;
                    if(discard.size() > 0 )
                        left.add(discard.remove(0));
                }else{
                    int num = right.poll();
                    ans+=num;
                    if(discard.size() > 0 )
                    right.add(discard.remove(discard.size()-1));
                }
            }else if(left.size() > 0){
                int num = left.poll();
                ans+=num;
                if(discard.size() > 0 )
                    left.add(discard.remove(0));
            }else{
                int num = right.poll();
                ans+=num;
                if(discard.size() > 0 )
                right.add(discard.remove(discard.size()-1));                
            }
        }
        
        return ans;
    }
}
