class Solution {
    
    public  int reverse(int num){
        String n = ""+num;
        String r = "";
        for(int i =0 ; i < n.length() ; i++)
            r = n.charAt(i)+r;
        return Integer.parseInt(r);
    }
    
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ans = 0 , mod = (int)(1e9);
        mod+=7;
        for(int i = 0 ; i < nums.length ; i++){
            int num = nums[i];
            int rev = reverse(num);
            int dif = num - rev;
            int temp = hm.getOrDefault(dif,0);
            ans+=temp;
            ans%=mod;
            hm.put(dif, temp+1);
        }
        return ans;
    }
}