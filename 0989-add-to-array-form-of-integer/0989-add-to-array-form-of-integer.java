class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer> l = new ArrayList<>();
        for(int a : num)
            l.add(a);
        
        int c = 0;
        int i = l.size()-1;
        while(i>=0 &&  k>0){
            int rem = k%10;
            int n =l.get(i); 
            l.remove(i);
            int add = rem+n+c;
            if(add>9){
                c = 1;
                l.add(i--,add%10);
            }else{
                c=0;
                l.add(i--,add%10);
            }
            k/=10;
            
        }
        while(i>=0 ){
            int rem = 0;
            int n =l.get(i); 
            l.remove(i);
            int add = rem+n+c;
            if(add>9){
                c = 1;
                l.add(i--,add%10);
            }else{
                c=0;
                l.add(i--,add%10);
            }
            
            
        }
        while(k>0){
            int rem = k%10;
            k/=10;
            int add = rem+c;
            if(add>9){
                c = 1;
                l.add(0,add%10);
            }else{
                c=0;
                l.add(0,add%10);
            }
            
        }
        if(c>0){
            l.add(0,c);
        }
        return l;
    }
}