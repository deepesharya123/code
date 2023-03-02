class Solution {
    public int compress(char[] chars) {
        char prevChar = chars[0];
        int count = 1, k = 0 ;
        for(int i = 1 ; i < chars.length ; i++){
            char c = chars[i];
            if(c == prevChar)
                count++;
            else{
                chars[k++] = prevChar;
                if(count==1){
                    prevChar = c;
                    continue;
                }
                String cs = "";
                cs+=count;
                char[] countArray = cs.toCharArray();
                for(char countChar :  countArray)
                    chars[k++] = countChar;
                
                prevChar = c;
                count = 1;
            }
        }
        chars[k++] = prevChar;
        if(count == 1)
            return k;
        
        String cs = "";
        cs+=count;
        char[] countArray = cs.toCharArray();
        for(char countChar :  countArray)
            chars[k++] = countChar;
        
        return k;
    }
}