class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1 )
            set.add(num);
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums2.length - 1 ; i++  ){
            if( nums2[i] == nums2[i + 1] )
                continue;
            if( set.contains(nums2[i]) )
                ans = Math.min(ans, nums2[i]);
        }
        if( set.contains(nums2[nums2.length - 1 ]) )
            ans = Math.min(ans, nums2[nums2.length - 1 ]);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}