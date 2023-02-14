class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        int c = -1;
        int i = a.length()-1, j = b.length()-1;
        while(i>=0 && j>=0 ){
            int ca = (a.charAt(i--) - '0');
            int cb = (b.charAt(j--) - '0');
            int dif = ca+cb;
            System.out.println(dif);
            if(c!=-1)
            dif+=c;
            if(dif==0){
                ans+="0";
                c=-1;
            }else if(dif==1){
                ans+="1";
                c=-1;
            }else if(dif==2){
                ans+="0";
                c=1;
            }else{
                ans+="1";
                c=1;
            }
            System.out.println(dif+" "+ans+" "+c);
        }
        System.out.println(ans);
        // solve(i,a,c,ans);
        while(i>=0){
            int cb = a.charAt(i--) - '0';
            int dif = cb;
            if(c!=-1)
                dif+=c;
            if(dif==0){
                ans+="0";
                c=-1;
            }else if(dif==1){
                ans+="1";
                c=-1;
            }else if(dif==2){
                ans+="0";
                c=1;
            }else{
                ans+="1";
                c=1;
            }
            System.out.println(dif+" sa "+ans+" "+c+ " "+a);
        }
        System.out.println(ans+" "+c);
        // solve(j,b,c,ans);
        while(j>=0){
            int cb = b.charAt(j--) - '0';
            int dif = cb;
            if(c!=-1)
                dif+=c;
            if(dif==0){
                ans+="0";
                c=-1;
            }else if(dif==1){
                ans+="1";
                c=-1;
            }else if(dif==2){
                ans+="0";
                c=1;
            }else{
                ans+="1";
                c=1;
            }
            System.out.println(dif+" sa "+ans+" "+c+ " "+b);
        }
        System.out.println(ans+" "+c);
        if(c==1)
            ans+=c;
        System.out.println("E"+ans);
        
        return (new StringBuilder(ans)).reverse().toString();
    }
}


/*

"11"
"1"
"1010"
"1011"

*/