class TwoSum {
    
    public static void merge(int[] ar, int l, int m, int h){
        int n1 = m-l+1;
        int n2 = h-m;
        
        int[] le = new int[n1];
        int[] r = new int[n2];
        int i =0;
        for(i=0;i<n1;i++)
            le[i]=ar[l+i];
        for(i=0;i<n2;i++)
            r[i]=ar[m+i+1];
        
        int j =0,k=l;
        i=0;

        while(i<n1&&j<n2){
            if(le[i]<r[j]){
                ar[k]=le[i];
                i++;
            }else{
                ar[k]=r[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            ar[k]=le[i];
            i++;
            k++;
        }
        while(j<n2){
            ar[k]=r[j];
            j++;
            k++;
        }
        
    }    

    public static void sort(int[] ar, int l, int h){
        if(l<h){
            int m = l+((h-l)/2);
            
            sort(ar,l,m);
            sort(ar,m+1,h);

            merge(ar,l,m,h);

        }else
            return;
    }
    
    public static int search(int[] ar,int se,int l, int h,int i){
        
        if(h>=l){
            int m = l+((h-l)/2);
            // System.out.println((ar[m]==se&&m!=i)+" "+ar[m]+" "+m+" "+i);
            if(m!=i&&ar[m]==se)   return m;
            else if(ar[m]<se) 
                return search(ar,se,m+1,h,i);
            return search(ar,se,l,m-1,i);
    
        }
        return -1;

    }

    public int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
        int i = 0,n=nums.length;
        int[] ar= new int[n];
        for(i=0;i<n;i++)    ar[i]=nums[i];
        sort(nums,0,n-1);

        for(i=0;i<n;i++){
            int se = target-nums[i];
            System.out.println(se);
            int ind = search(nums,se,0,n-1,i);
            if(ind>=0){
                int same[] =new int[2];
                int si=0;
                for(int j = 0;j<n;j++){
                    if(ar[j]==nums[i]){
                        ans[0]=j;
                        break;
                    }
                }
                for(int j =0;j<n;j++){
                    if(ar[j]==se){
                        same[si]=j;
                        si++;
                    }
                    if(si==2) break;
                }
                ans[1]=same[0]!=ans[0]?same[0]:same[1];
                
                break;
            }
        }
        
        return ans;
    }
}
