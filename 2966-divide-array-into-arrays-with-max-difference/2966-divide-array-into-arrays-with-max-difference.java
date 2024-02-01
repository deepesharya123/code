class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] ans = new int[n/3][3];
        List<Integer> list = new ArrayList<>();
        for(int num : nums )
            list.add(num);
        Collections.sort(list);
        int cur = 0, poss = 1;
        System.out.println(list);
        for(int i = 0 ; i < n ; i++ ){
            int first = (int) list.get(i++) ;
            int second =(int) list.get(i++) ;
            int third =(int) list.get(i);
            
            if( second-first > k || third - second > k || third-first > k )
                return new int[][] {};
            
            ans[cur][0] = first;
            ans[cur][1] = second;
            ans[cur][2] = third;
            cur++;  
        }
        
        
        return ans;
    }
}