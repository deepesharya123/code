class Solution {
    public int minFlipsMonoIncr(String s) {
        int flips = 0, ones = 0, zeros =0;
        for(int i=s.indexOf('1');i<s.length();i++){
            char c = s.charAt(i);
            if(c=='1')
                ones++;
            else
                flips++;
            flips = Math.min(ones,flips);
        }
        
        
        return flips;
    }
}

