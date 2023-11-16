class Solution {
    
    public int binaryToDecimal(String s){
        int ans = 0 ;
        int i = 0 , n = s.length();
        while( i < n ){
            char c = s.charAt(i++);
            ans*=2;
            if( c == '1')
                ans++;
        }
        return ans;
    }
    
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(String s : nums){
            set.add(binaryToDecimal(s));
        }
        String ans = "";
        // System.out.println(set);
        int i = 0;
        while( true ){
            if( ans.length() > 0 )
                break;
            if( !set.contains(i) ){
                int num = i;
                while( num > 0 ){
                    int d = num % 2;
                    ans = d +ans;
                    num/=2;
                }
                break;
            }
            i++;
        }
        n = nums.length;
        while( ans.length() < n)
            ans = "0"+ans;
        return ans;
    }
}