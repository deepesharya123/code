class Solution {
    public int reverse(int x) {
        long ans = 0;
        String s = "";
        if(x<0){
            String ss = "";
            ss+=x;
            s = ss.substring(1);
        }else
            s+=x;
        
        StringBuilder input1 = new StringBuilder();
  
        input1.append(s);
  
        input1.reverse();
        String convert = "";
        convert+=input1;
        if(x<0)
            convert="-"+convert;        
        ans = Long.parseLong(convert);
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)
            ans = 0;
        return (int) ans;
    }
}