class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] yes = new int[n];
        int[] no = new int[n];
        int i = 0;
        if(customers.charAt(i) == 'Y')
            yes[0] = 1;
        else
            no[0] = 1;
        for( i = 1 ; i < n ; i++){
            char c = customers.charAt(i);
            if(c == 'Y'){
                yes[i] = yes[i-1] + 1;
                no[i] = no[i-1];
            }else{
                no[i] = no[i-1] + 1;
                yes[i] = yes[i-1];
            }
            // System.out.println(yes[i]+"___"+no[i]);
        }
        int ans = Integer.MAX_VALUE, h = -1;
        
        for(i = 0 ; i < n ; i++){
            int temp = 0;
            if(i == 0){
                ans = yes[n-1];
                h = 0;
                
                // System.out.println(ans+" penalty for i "+i);
                continue;
            }
            int penaltyLeft = no[i-1];
            int penaltyRight = n-i-(no[n-1] - no[i-1]);
            // // System.out.println(penaltyLeft+" penalty "+penaltyRight);
            temp = penaltyLeft + penaltyRight;
            // System.out.println(temp+" penalty for i "+i);
            if(temp < ans){
                ans = temp;
                h = i;
            }
        }
        if(ans > no[n-1]){
            h = n;
        }
        return h;
    }
}