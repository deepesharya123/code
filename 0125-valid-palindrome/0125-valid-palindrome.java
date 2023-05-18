class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        int a = 'a', z = 'z', A = 'A',Z ='Z' ,space = ' ', comma = ',' , zero = '0', n = '9';
        while(i < j){
            char f = s.charAt(i), e = s.charAt(j) ;
            if(f>=A && f<=Z)    f+=(a-A);
            if(e>=A && e<=Z)    e+=(a-A);
                        
            if( !( (f >= zero && f <= n) || (f >= a && f <= z)) ){
                i++;
                continue;
            }
            if( !( ((e >= zero && e <= n)) || (e >= a && e <= z)) ){
                j--;
                continue;
            }
            if(f!=e){
                System.out.println(f+" "+e +" "+ i+ " "+j);
                return false;
            }
            i++;
            j--;
            System.out.println(s.charAt(i)+" "+s.charAt(j));
        }
        return true;
    }
}


/*

"A man, a plan, a canal: Panama"
"race a car"
" "



*/