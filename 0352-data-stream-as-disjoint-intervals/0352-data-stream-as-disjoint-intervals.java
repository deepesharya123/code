class SummaryRanges {
    TreeSet<Integer> ts =new TreeSet<>();
    public SummaryRanges() {
        
    }
    
    public void addNum(int value) {
        ts.add(value);
    }
    
    public int[][] getIntervals() {
        if(ts.isEmpty())
           return new int[1][2]; 
        
        List<int[]> l = new ArrayList<>();
        int left = -1, right = -1;
        for(int value: ts){
            if(left<0){
                left = right = value;
            }else if(value == right+1){
                right = value;
            }else{
                l.add(new int[] {left,right});
                
                left = right = value;
            }
        }
        l.add(new int[] {left,right});
                
        return l.toArray(new int[0][]);
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */