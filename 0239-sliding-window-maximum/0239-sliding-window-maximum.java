class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        PriorityQueue<Integer> mxheap = new PriorityQueue<>(Collections.reverseOrder());
        int ii = 0, i = 0, max =  Integer.MIN_VALUE;
        Deque<Integer> deque = new ArrayDeque<>();
        // System.out.println(deque.peekLast());
        for(i = 0 ; i < n ; i++ ){
            int num = nums[i];
            if(i < k ){
                while(deque.size() > 0 && nums[deque.peekLast()] <= num )
                    deque.removeLast();
                deque.offerLast(i);
                if(i == k-1)
                ans[ii++] = nums[deque.peekFirst()];
            }else{
                if(deque.peekFirst() == i-k )
                    deque.pollFirst();
                
                while(deque.size() > 0 && nums[deque.peekLast()] <= num )
                    deque.removeLast();
                deque.add(i);
                
                ans[ii++] = nums[deque.peekFirst()];
            }
        }
        return ans;
    }
}


/*

[1,3,-1]
3
[1,3,-1,-3,5,3,6,7]
3
[1,3,-1,-3,5,3,6,7]
2
[1,3,-1,-3,5,3,6,7]
4
[1,3,-1,-3,5,3,6,7]
1
[1,3,-1,-3,5,3,6,7]
8


*/