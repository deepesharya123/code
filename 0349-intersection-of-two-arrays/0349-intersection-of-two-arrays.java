class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num  : nums1 )
            set.add(num);
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int num : nums2){
            if( set.contains(num) ){   
                ans.add(num);
                set.remove(num);
            }
        }
        
        return ans.stream().mapToInt( i -> i).toArray();
    }
}