class Solution {
    
    public int solveForAtMostK(int[] nums, int k ){
        
        int n = nums.length, i = 0 , j = 0 ;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while( j < n ){
            int num = nums[j];
            map.put(num , map.getOrDefault(num , 0) + 1);
            while( map.size() > k ){
                int rm = nums[i++];
                map.put(rm, map.get(rm) - 1);
                if( map.get(rm) == 0 )
                    map.remove(rm);
            }
            int dif = j-i+1;
            ans+=dif;
            j++;

        }
        return ans;
        
    }
    
    public int subarraysWithKDistinct(int[] nums, int k) {
        return solveForAtMostK(nums, k) - solveForAtMostK(nums, k - 1); 
    }
}

/*
[1,2,1,2,3]
2
[1,2,1,3,4]
3
[1,2]
2
[1,2,1]
2
[1,2,1]
2
[1,2,1,2]
2
[1,2,1,3]
2
*/