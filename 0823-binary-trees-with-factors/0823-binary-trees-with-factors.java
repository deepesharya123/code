class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Long> hm = new HashMap<>();
        int ans = 1;
        int mod = (int)( 1e9)+7;
        long count = 1;
        hm.put( arr[0], count);
        for(int i = 1 ; i < arr.length ; i++){
            long sum = 1;
            for(int j = 0 ; j <= i ; j++ ){
                if( arr[i] % arr[j] == 0 && (hm.containsKey(arr[i]/arr[j]) ) )
                    sum += hm.get( arr[i] /arr[j] ) * hm.get(arr[j]);
            }
            hm.put( arr[i], sum);
            sum%=mod;
            ans+=sum;
            ans%=mod;
        }
        return ans;
    }
    
}