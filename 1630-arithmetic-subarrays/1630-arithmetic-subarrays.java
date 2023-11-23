class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int i = 0 , m = l.length, n = nums.length;
        List<Boolean> ans = new ArrayList<>();
        while( i < m ){
            int ll = l[i], rr = r[i];
            i++;
            List<Integer> list = new ArrayList<>();
            for(int j = ll ; j <= rr ; j++)
                list.add(nums[j]);
            Collections.sort(list);
            boolean ap = true;
            if( list.size() > 1){
                int dif = list.get(1) - list.get(0);
                for(int j = 2; j < rr-ll+1 ; j++){
                    int d = list.get(j) - list.get(j-1);
                    if( d != dif ){
                        ap = false;
                        break;
                    }
                }
            }
            ans.add(ap);
        }
        return ans;
    }
}