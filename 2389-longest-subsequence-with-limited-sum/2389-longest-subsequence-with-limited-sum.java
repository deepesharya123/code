class Solution  {
    public static int search(int[] nums,int q){
        int i = 0,n = nums.length;
        int j = n-1;
        int ans=  0;
        while(i<=j){
            int mid = i + (j-i)/2;
            System.out.println(q+" "+ nums[mid]+"  if mid requires"+mid);
            if(nums[mid]==q){
                ans = mid+1;
                break;
            }
            else if(nums[mid]>q)
                j = mid-1;
            else{
                i = mid+1;
                ans = mid+1;
            }
        }
        return ans;
    }
    
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length,m = queries.length;
        int[] ans = new int[m];
        Arrays.sort(nums);
        int[] s = new int[n];
        for(int i =0;i<n;i++){
            if(i==0){
                s[i]=nums[i];
                continue;
            }
            s[i]+=s[i-1]+nums[i];
        // System.out.println(s[i]);
        }
        for(int i = 0;i<m;i++){
            int q = queries[i];
            if(s[0]>q){
                ans[i]=0;
                continue;
            }
            ans[i] = search(s,q);
            
            System.out.println(ans[i]);
        }
        return ans;
        
    }
}