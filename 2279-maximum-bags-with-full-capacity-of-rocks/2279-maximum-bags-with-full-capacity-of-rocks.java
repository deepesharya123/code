class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
//         PriorityQueue<Integer,Integer> pq = new PriorityQueue<>();
        List<Integer> l = new ArrayList<>(); 
        int i =  0, n = rocks.length;
        for(i=0;i<n;i++){
            int cap = capacity[i];
            int rock = rocks[i];
            
            int leftCapacity = cap-rock;
            l.add(leftCapacity);
        }
        int count = 0;
        Collections.sort(l);
        for(i=0;i<l.size();i++){
            int num = (int) l.get(i);
            if(additionalRocks>=num){
                count++;
                additionalRocks-=num;
            }
        }
        return count;
    }
}